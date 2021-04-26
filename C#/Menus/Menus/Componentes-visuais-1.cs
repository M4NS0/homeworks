using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Menus
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void menuStrip2_ItemClicked(object sender, ToolStripItemClickedEventArgs e)
        {

        }

        private void subMenuArquivo_Click(object sender, EventArgs e)
        {

        }

        private void arquivoAbrir_Click(object sender, EventArgs e)
        {
            MessageBox.Show("Abrindo arquivo...", "Informação", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }
    }
}
