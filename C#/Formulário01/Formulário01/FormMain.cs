using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Formulário01
{
    public partial class FormMain : Form
    {
        public FormMain()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
           //MessageBox.Show("Seja bem vindo");
        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void FormMain_FormClosed(object sender, FormClosedEventArgs e)
        {
            DialogResult dr = MessageBox.Show("Deseja Sair?", "Confirmação", MessageBoxButtons.YesNo, MessageBoxIcon.Question);

            if(dr != DialogResult.Yes)
            {
                this.Close();
            } else
            {
                
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            var form = new FormSobre();
            form.ShowDialog();
        }

        private void keyAPressed(object sender, KeyPressEventArgs e)
        {
            if (e.KeyChar == 65)
            {
                var form = new FormSobre();
                form.ShowDialog();
            }
        }
    }
}
