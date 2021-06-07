using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using CadastroVacinacao.DAO;
using CadastroVacinacao.Entidades;

namespace CadastroVacinacao
{
    public partial class CadastroForm : Form
    {
        DataTable dtb;
        private string date = "";
        private int id = 0;

        public CadastroForm()
        {
            InitializeComponent();
            LoadTable();
            PopularCombobox();
            SetCustomDateTimePicker();
            SetBlankDateTimePicker();
        }
        private void SetCustomDateTimePicker()
        {
            dateTimePicker.Format = DateTimePickerFormat.Custom;
            dateTimePicker.CustomFormat = "dd/MM/yyyy";
        }
        private void SetBlankDateTimePicker()
        {
            dateTimePicker.Format = DateTimePickerFormat.Custom;
            dateTimePicker.CustomFormat = "00/00/00";
            
        }
        private void LoadTable()
        {
            DataTable tabela = PopularDataTable();
            dataGridView.DataSource = tabela;

        }
        private DataTable PopularDataTable()
        {
            dtb = new DataTable();
            dtb.Columns.Add("Id", typeof(int));
            dtb.Columns.Add("Nome", typeof(string));
            dtb.Columns.Add("Data da Vacinação", typeof(string));
            dtb.Columns.Add("Nome da Vacina", typeof(string));
            dtb.Columns.Add("Fabricante", typeof(string));
            dtb.Columns.Add("Origem", typeof(string));
            dtb.Columns.Add("Dosagem", typeof(string));

            DataTable dt = new DataTable();
            RegistroDao dao = new RegistroDao();
            dt = dao.Listar();

            for (int  i = 0; i < dt.Rows.Count; i ++)
            {
                dtb.Rows.Add(
                    dt.Rows[i].ItemArray[0],
                    dt.Rows[i].ItemArray[1],
                    dt.Rows[i].ItemArray[2],
                    dt.Rows[i].ItemArray[3],
                    dt.Rows[i].ItemArray[4],
                    dt.Rows[i].ItemArray[5],
                    dt.Rows[i].ItemArray[6]);
            }
                
            return dtb;
        }
        private void button5_Click(object sender, EventArgs e)
        {
            this.Hide();
            NovaVacina form = new NovaVacina();
            form.ShowDialog();
        }
        private void PopularCombobox()
        {
            VacinaDao dao = new VacinaDao();
            DataTable dt = new DataTable();
            dt = dao.Listar();
            comboBox.Text = " ";
            comboBox.DataSource = dt;
            comboBox.DisplayMember = "fabricante";
        }
        private void comboBox_SelectedIndexChanged(object sender, EventArgs e)
        {
            String selected = comboBox.Text;

            Vacina vacina = new Vacina();
            vacina.Fabricante = selected;
            VacinaDao dao = new VacinaDao();

            DataTable dt = dao.BuscarDosagem(vacina);

            if (dt.Rows.Count > 0)
            {
                String result = dt.Rows[0].ItemArray[0].ToString();
                txtDosagem.Text = result;

                dt = dao.BuscarIdVacina(vacina);
                result = dt.Rows[0].ItemArray[0].ToString();
                txtCodigo.Text = result;
            }
        }
        private void button1_Click(object sender, EventArgs e)
        {
            EnableFields();
            
            ClearFields();
        }
        private void EnableFields()
        {
            btnNovo.Enabled = true;
            dateTimePicker.Enabled = true;
            txtNomeCompleto.Enabled = true;
            comboBox.Enabled = true;
            btnSalvar.Enabled = true;
        }
        private void dateTimePicker_ValueChanged(object sender, EventArgs e)
        {
            SetCustomDateTimePicker();
            date = dateTimePicker.Text;   
        }
        private void btnSalvar_Click(object sender, EventArgs e)
        {
            btnNovo.Enabled = true;
            if (txtNomeCompleto.Text.Equals("") || date.Equals("") || (comboBox.SelectedItem.Equals("")))
            {
                MessageBox.Show("Por favor, verifique se todos os campos estão preenchidos");
                
            } else
            {
                RegistroDao dao = new RegistroDao();
                Registro registro = new Registro();
                registro.Nome = txtNomeCompleto.Text;
                registro.DataVacinacao = date.ToString();
                registro.IdVacina = int.Parse(txtCodigo.Text);

                dao.Salvar(registro);

                LoadTable();
                DisableFields();
            }
        }     
        private void DisableFields()
        {
            dateTimePicker.Enabled = false;
            btnSalvar.Enabled = false;
            txtNomeCompleto.Enabled = false;
            comboBox.Enabled = false;
        }
        private void GetRegisterById(object sender, EventArgs e)
        {
            RegistroDao dao = new RegistroDao();
            if (!txtBusca.Text.Equals(""))
            {
                DataTable tabela = PopularDataTableComBusca(txtBusca.Text);
                dataGridView.DataSource = tabela;
            } else
            {
                LoadTable();
            }
            
        }
        private DataTable PopularDataTableComBusca(string value)
        {
            dtb = new DataTable();
            dtb.Columns.Add("Id", typeof(int));
            dtb.Columns.Add("Nome", typeof(string));
            dtb.Columns.Add("Data da Vacinação", typeof(string));
            dtb.Columns.Add("Nome da Vacina", typeof(string));
            dtb.Columns.Add("Fabricante", typeof(string));
            dtb.Columns.Add("Origem", typeof(string));
            dtb.Columns.Add("Dosagem", typeof(string));

            DataTable dt = new DataTable();
            RegistroDao dao = new RegistroDao();
            dt = dao.GetRegistroByString(value);

            for (int i = 0; i < dt.Rows.Count; i++)
            {
                dtb.Rows.Add(
                    dt.Rows[i].ItemArray[0], 
                    dt.Rows[i].ItemArray[1], 
                    dt.Rows[i].ItemArray[2], 
                    dt.Rows[i].ItemArray[3], 
                    dt.Rows[i].ItemArray[4], 
                    dt.Rows[i].ItemArray[5], 
                    dt.Rows[i].ItemArray[6]);
            }
            return dtb;
        }
        private void dataGridView_CellContentClick_1(object sender, DataGridViewCellEventArgs e)
        {
            EnableEditarDeletar();
            id = Convert.ToInt32(dataGridView.Rows[dataGridView.CurrentRow.Index].Cells[0].Value);
            txtNomeCompleto.Text = dataGridView.Rows[dataGridView.CurrentRow.Index].Cells[1].Value.ToString();
            dateTimePicker.CustomFormat = dataGridView.Rows[dataGridView.CurrentRow.Index].Cells[2].Value.ToString();
            comboBox.Text = dataGridView.Rows[dataGridView.CurrentRow.Index].Cells[4].Value.ToString();
            btnSalvar.Enabled = false;
            EnableFields();
            btnSalvar.Enabled = false;
        }
        private void EnableEditarDeletar()
        {
            btnEditar.Enabled = true;
            btnExcluir.Enabled = true;
            btnSalvar.Enabled = true;
        }
        private void btnExcluir_Click(object sender, EventArgs e)
        {
            if (id > 0)
            {
                RegistroDao dao = new RegistroDao();
                dao.Excluir(id);
                MessageBox.Show("Excluido com sucesso!");
                LoadTable();
                DisableFields();
                btnNovo.Enabled = true;
            }
        }
        private void btnEditar_Click(object sender, EventArgs e)
        {
            Registro registro = new Registro();
            RegistroDao dao = new RegistroDao();
            registro.Nome = txtNomeCompleto.Text;
            registro.IdVacina = int.Parse(txtCodigo.Text);
            registro.DataVacinacao = dateTimePicker.Text;
            registro.Id = id;
            dao.Editar(registro, id);
            LoadTable();
            DisableFields();
            ClearFields();

        }
        private void ClearFields()
        {
            txtNomeCompleto.Text = "";
            dateTimePicker.Text = "";
            comboBox.Text = "";
            txtCodigo.Text = "";

        }
    }
}
