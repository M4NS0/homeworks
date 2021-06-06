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
    public partial class RecuperarSenha : Form
    {
        public RecuperarSenha()
        {
            InitializeComponent();
        }

        private void recuperarSenhaFormBtnVoltar_Click(object sender, EventArgs e)
        {
            this.Hide();
            login form = new login();
            form.ShowDialog();
            
        }

        private void recuperarSenhaFormBtnVerificar_Click(object sender, EventArgs e)
        {
            UsuarioDao dao = new UsuarioDao();
            DataTable dataTable = dao.VerificarRecuperacao(recuperarSenhaUsuario.Text, recuperarSenhaFrase.Text);
            String frase = dataTable.Rows[0].ItemArray[4].ToString();
            
            if (recuperarSenhaFrase.Text == frase)
            { 
                String senha = dataTable.Rows[0].ItemArray[3].ToString();
                String email = dataTable.Rows[0].ItemArray[1].ToString();
                MessageBox.Show("Anote sua senha: " + senha + "\nEmail registrado: " + email);         
            }
            else
            {
                MessageBox.Show("Dados não conferem");
            }
        }
    }
}
