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
        public NovaVacina()
        {
            InitializeComponent();
        }

        private void novoUsuarioFormBtnVoltar_Click(object sender, EventArgs e)
        {
            this.Hide();
            CadastroForm form = new CadastroForm();
            form.ShowDialog();
        }

        private void novoUsuarioFormBtnRegistrar_Click(object sender, EventArgs e)
        {
            this.Hide();
            Vacina vacina = new Vacina();
            vacina.Nome = inscricaoNomeVacina.Text;
            vacina.Fabricante = inscricaoFabricante.Text;
            vacina.Origem = inscricaoOrigem.Text;
            vacina.Dose = inscricaoDosagem.Text;

            VacinaDao dao = new VacinaDao();
            dao.Salvar(vacina);

            MessageBox.Show("Vacina " + vacina.Nome + " adicionada com Sucesso");
            CadastroForm form = new CadastroForm();
            form.ShowDialog();

        }

        private void btnRemover_Click(object sender, EventArgs e)
        {
            Vacina vacina = new Vacina();
            VacinaDao dao = new VacinaDao();
            if (!delecaoPorId.Text.Equals(""))
            {
                vacina.Id = int.Parse(delecaoPorId.Text);
                dao.Excluir(vacina);
                MessageBox.Show("Vacina de id No" + delecaoPorId.Text + " deletada com sucesso!");
            } else
            {
                MessageBox.Show("ID inválido");
            }
        }
    }
}
