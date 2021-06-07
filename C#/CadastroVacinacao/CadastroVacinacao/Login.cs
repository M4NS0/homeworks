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
    public partial class NovoUsuarioForm : Form
    {

        public NovoUsuarioForm()
        {
            InitializeComponent();
        }

        private void segundoFormBtnVoltar_Click(object sender, EventArgs e)
        {
            this.Hide();
            login form = new login();
            form.ShowDialog();

        }

        private void novoUsuarioFormBtnRegistrar_Click(object sender, EventArgs e)
        {
            this.Hide();
            Usuario objeto = new Usuario();
            objeto.Email = novoUsuarioFormTxtEmail.Text;
            objeto.Nome = novoUsuarioFormTxtUsuario.Text;
            objeto.Senha = novoUsuarioFormTxtSenha.Text;
            objeto.ChaveDeRecuperacao = novoUsuarioFormTxtFrase.Text;
            UsuarioDao dao = new UsuarioDao();
            dao.Salvar(objeto);
            login form = new login();
            form.ShowDialog();

        }

        private void NovoUsuarioForm_Load(object sender, EventArgs e)
        {

        }
    }
}
