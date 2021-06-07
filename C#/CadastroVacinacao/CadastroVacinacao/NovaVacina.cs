using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using CadastroVacinacao.Entidades;
using CadastroVacinacao.DAO;

namespace CadastroVacinacao
{
    public partial class NovaVacina : Form
    {
        DataTable dtb;
        private int id;

        public NovaVacina()
        {
            InitializeComponent();
            LoadTable();
            DisableStuffs();
        }

        private void DisableStuffs()
        {
            btnEditar.Enabled = false;
            btnAtualizar.Enabled = false;
            btnRemover.Enabled = false;

        }

        private void LoadTable()
        {
            DataTable tabela = PopularDataTable();
            dataGridViewVacina.DataSource = tabela;

        }

        private DataTable PopularDataTable()
        {
            dtb = new DataTable();
            dtb.Columns.Add("Id", typeof(int));
            dtb.Columns.Add("Nome", typeof(string));
            dtb.Columns.Add("Fabricante", typeof(string));
            dtb.Columns.Add("Dose", typeof(string));
            dtb.Columns.Add("Origem", typeof(string));

            DataTable dt = new DataTable();
            VacinaDao dao = new VacinaDao();
            dt = dao.Listar();

            for (int i = 0; i < dt.Rows.Count; i++)
            {
                dtb.Rows.Add(
                    dt.Rows[i].ItemArray[0],
                    dt.Rows[i].ItemArray[1],
                    dt.Rows[i].ItemArray[2],
                    dt.Rows[i].ItemArray[3],
                    dt.Rows[i].ItemArray[4]);
            }

            return dtb;
        }
        private void novoUsuarioFormBtnVoltar_Click(object sender, EventArgs e)
        {
            this.Hide();
            CadastroForm form = new CadastroForm();
            form.ShowDialog();
        }

        private void novoUsuarioFormBtnRegistrar_Click(object sender, EventArgs e)
        {
            
            if (inscricaoNomeVacina.Text.Equals("")|| inscricaoFabricante.Text.Equals("") || inscricaoOrigem.Text.Equals("") || inscricaoDosagem.Text.Equals(""))
            {
                MessageBox.Show("Por favor, verifique se todos os campos estão preenchidos");
            } else
            {
                Vacina vacina = new Vacina();
                vacina.Nome = inscricaoNomeVacina.Text;
                vacina.Fabricante = inscricaoFabricante.Text;
                vacina.Origem = inscricaoOrigem.Text;
                vacina.Dose = inscricaoDosagem.Text;

                VacinaDao dao = new VacinaDao();
                dao.Salvar(vacina);

                MessageBox.Show("Vacina " + vacina.Nome + " adicionada com Sucesso");
                CadastroForm form = new CadastroForm();
                LoadTable();
            }

           


        }

        private void btnRemover_Click(object sender, EventArgs e)
        {
            Vacina vacina = new Vacina();
            VacinaDao dao = new VacinaDao();
            dao.Excluir(id);
            LoadTable();
            CleanLabels();
            inscricaoNomeVacina.Text = "";
            inscricaoFabricante.Text = "";
            inscricaoOrigem.Text = "";
            inscricaoDosagem.Text = "";


        }

        private void CleanLabels()
        {
            inscricaoNomeVacina.Text = "";
            inscricaoFabricante.Text = "";
            inscricaoOrigem.Text = "";
            inscricaoDosagem.Text = "";
        }

        private void dataGridViewVacina_CellContentClick(object sender, DataGridViewCellEventArgs e)
        {
            id = Convert.ToInt32(dataGridViewVacina.Rows[dataGridViewVacina.CurrentRow.Index].Cells[0].Value);
            inscricaoNomeVacina.Text = dataGridViewVacina.Rows[dataGridViewVacina.CurrentRow.Index].Cells[1].Value.ToString();
            inscricaoFabricante.Text = dataGridViewVacina.Rows[dataGridViewVacina.CurrentRow.Index].Cells[2].Value.ToString();
            inscricaoOrigem.Text = dataGridViewVacina.Rows[dataGridViewVacina.CurrentRow.Index].Cells[4].Value.ToString();
            inscricaoDosagem.Text = dataGridViewVacina.Rows[dataGridViewVacina.CurrentRow.Index].Cells[3].Value.ToString();
            DisableFields();
            
            EnableButtons();
        }

        private void EnableButtons()
        {
            btnEditar.Enabled = true;
            btnRemover.Enabled = true;
        }

        private void DisableFields()
        {
            inscricaoNomeVacina.Enabled = false;
            inscricaoFabricante.Enabled = false;
            inscricaoOrigem.Enabled = false;
            inscricaoDosagem.Enabled = false;
            novoUsuarioFormBtnRegistrar.Enabled = false;
        }

        private void btnEditar_Click(object sender, EventArgs e)
        {
            Vacina vacina = new Vacina();
            VacinaDao dao = new VacinaDao();
            vacina.Nome = inscricaoNomeVacina.Text;
            vacina.Origem = inscricaoOrigem.Text;
            vacina.Dose = inscricaoDosagem.Text;
            vacina.Fabricante = inscricaoFabricante.Text;
            dao.Editar(vacina, id);
            LoadTable();
            MessageBox.Show("Vacina " + vacina.Nome + " atualizada");
        }

        private void btnEditar_Click_1(object sender, EventArgs e)
        {
            EnableFields();
        
        }

        private void EnableFields()
        {
            inscricaoNomeVacina.Enabled = true;
            inscricaoFabricante.Enabled = true;
            inscricaoOrigem.Enabled = true;
            inscricaoDosagem.Enabled = true;
            btnAtualizar.Enabled = true;
           
        }

 

        private void DisableButtons()
        {
            btnAtualizar.Enabled = false;
            btnRemover.Enabled = false;
            btnAtualizar.Enabled = false;
        }

        private void btnNovaVacina_Click_1(object sender, EventArgs e)
        {
            CleanLabels();
            DisableButtons();
            EnableFields();
            btnNovaVacina.Enabled = true;
            btnEditar.Enabled = false;
            novoUsuarioFormBtnRegistrar.Enabled = true;
            btnAtualizar.Enabled = false;
        }
    }
}
