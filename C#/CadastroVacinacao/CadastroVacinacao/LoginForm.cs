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

namespace CadastroVacinacao
{
    public partial class login : Form
    {
        public login()
        {
            InitializeComponent();
        }

        private void login_Load(object sender, EventArgs e)
        {

        }

        private void primeiroFormBtnAcessar_Click_1(object sender, EventArgs e)
        {
            UsuarioDao dao = new UsuarioDao();
            if (dao.VerificarComNomeSenha(primeiroFormTxtUsuario.Text, primeiroFormTxtSenha.Text).Rows.Count > 0)
            {
                this.Hide();
                CadastroForm form = new CadastroForm();
                form.ShowDialog();
            }
            else
            {
                MessageBox.Show("Senha incorreta!");
            }

        }

        private void primeiroFormBtnRegistra_Click(object sender, EventArgs e)
        {
            this.Hide();
            NovoUsuarioForm form = new NovoUsuarioForm();
            form.ShowDialog();
        }

        private void primeiroFormBtnRecuperar_Click_1(object sender, EventArgs e)
        {
            this.Hide();
            RecuperarSenha form = new RecuperarSenha();
            form.ShowDialog();
        }
    }
}
