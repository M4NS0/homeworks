
namespace Menus
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.menuStrip2 = new System.Windows.Forms.MenuStrip();
            this.subMenuArquivo = new System.Windows.Forms.ToolStripMenuItem();
            this.subMenuEditar = new System.Windows.Forms.ToolStripMenuItem();
            this.subMenuAjuda = new System.Windows.Forms.ToolStripMenuItem();
            this.arquivoAbrir = new System.Windows.Forms.ToolStripMenuItem();
            this.arquivoSalvar = new System.Windows.Forms.ToolStripMenuItem();
            this.arquivoSalvarComo = new System.Windows.Forms.ToolStripMenuItem();
            this.arquivoFechar = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator1 = new System.Windows.Forms.ToolStripSeparator();
            this.itemAjuda = new System.Windows.Forms.ToolStripMenuItem();
            this.itemColar = new System.Windows.Forms.ToolStripMenuItem();
            this.itemCopiar = new System.Windows.Forms.ToolStripMenuItem();
            this.toolStripSeparator2 = new System.Windows.Forms.ToolStripSeparator();
            this.itemConteudoDeAjuda = new System.Windows.Forms.ToolStripMenuItem();
            this.menuStrip2.SuspendLayout();
            this.SuspendLayout();
            // 
            // menuStrip1
            // 
            this.menuStrip1.Location = new System.Drawing.Point(0, 24);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(800, 24);
            this.menuStrip1.TabIndex = 0;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // menuStrip2
            // 
            this.menuStrip2.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.subMenuArquivo,
            this.subMenuEditar,
            this.subMenuAjuda});
            this.menuStrip2.Location = new System.Drawing.Point(0, 0);
            this.menuStrip2.Name = "menuStrip2";
            this.menuStrip2.Size = new System.Drawing.Size(800, 24);
            this.menuStrip2.TabIndex = 1;
            this.menuStrip2.Text = "menuStrip2";
            this.menuStrip2.ItemClicked += new System.Windows.Forms.ToolStripItemClickedEventHandler(this.menuStrip2_ItemClicked);
            // 
            // subMenuArquivo
            // 
            this.subMenuArquivo.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.arquivoAbrir,
            this.arquivoSalvar,
            this.arquivoSalvarComo,
            this.toolStripSeparator1,
            this.arquivoFechar});
            this.subMenuArquivo.Name = "subMenuArquivo";
            this.subMenuArquivo.Size = new System.Drawing.Size(61, 20);
            this.subMenuArquivo.Text = "&Arquivo";
            this.subMenuArquivo.Click += new System.EventHandler(this.subMenuArquivo_Click);
            // 
            // subMenuEditar
            // 
            this.subMenuEditar.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.itemColar,
            this.itemCopiar});
            this.subMenuEditar.Name = "subMenuEditar";
            this.subMenuEditar.Size = new System.Drawing.Size(49, 20);
            this.subMenuEditar.Text = "&Editar";
            // 
            // subMenuAjuda
            // 
            this.subMenuAjuda.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.itemConteudoDeAjuda,
            this.toolStripSeparator2,
            this.itemAjuda});
            this.subMenuAjuda.Name = "subMenuAjuda";
            this.subMenuAjuda.Size = new System.Drawing.Size(50, 20);
            this.subMenuAjuda.Text = "Aj&uda";
            // 
            // arquivoAbrir
            // 
            this.arquivoAbrir.Image = ((System.Drawing.Image)(resources.GetObject("arquivoAbrir.Image")));
            this.arquivoAbrir.Name = "arquivoAbrir";
            this.arquivoAbrir.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.A)));
            this.arquivoAbrir.Size = new System.Drawing.Size(180, 22);
            this.arquivoAbrir.Text = "Abrir";
            this.arquivoAbrir.Click += new System.EventHandler(this.arquivoAbrir_Click);
            // 
            // arquivoSalvar
            // 
            this.arquivoSalvar.Name = "arquivoSalvar";
            this.arquivoSalvar.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.S)));
            this.arquivoSalvar.Size = new System.Drawing.Size(180, 22);
            this.arquivoSalvar.Text = "Salvar";
            // 
            // arquivoSalvarComo
            // 
            this.arquivoSalvarComo.Name = "arquivoSalvarComo";
            this.arquivoSalvarComo.Size = new System.Drawing.Size(180, 22);
            this.arquivoSalvarComo.Text = "Salvar como...";
            // 
            // arquivoFechar
            // 
            this.arquivoFechar.Name = "arquivoFechar";
            this.arquivoFechar.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Alt | System.Windows.Forms.Keys.F4)));
            this.arquivoFechar.Size = new System.Drawing.Size(180, 22);
            this.arquivoFechar.Text = "Fechar";
            // 
            // toolStripSeparator1
            // 
            this.toolStripSeparator1.Name = "toolStripSeparator1";
            this.toolStripSeparator1.Size = new System.Drawing.Size(177, 6);
            // 
            // itemAjuda
            // 
            this.itemAjuda.Name = "itemAjuda";
            this.itemAjuda.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.H)));
            this.itemAjuda.Size = new System.Drawing.Size(180, 22);
            this.itemAjuda.Text = "Ajuda";
            // 
            // itemColar
            // 
            this.itemColar.Name = "itemColar";
            this.itemColar.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.V)));
            this.itemColar.Size = new System.Drawing.Size(180, 22);
            this.itemColar.Text = "Colar";
            // 
            // itemCopiar
            // 
            this.itemCopiar.Name = "itemCopiar";
            this.itemCopiar.ShortcutKeys = ((System.Windows.Forms.Keys)((System.Windows.Forms.Keys.Control | System.Windows.Forms.Keys.C)));
            this.itemCopiar.Size = new System.Drawing.Size(180, 22);
            this.itemCopiar.Text = "Copiar";
            // 
            // toolStripSeparator2
            // 
            this.toolStripSeparator2.Name = "toolStripSeparator2";
            this.toolStripSeparator2.Size = new System.Drawing.Size(177, 6);
            // 
            // itemConteudoDeAjuda
            // 
            this.itemConteudoDeAjuda.Name = "itemConteudoDeAjuda";
            this.itemConteudoDeAjuda.Size = new System.Drawing.Size(180, 22);
            this.itemConteudoDeAjuda.Text = "Conteúdo de Ajuda";
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(800, 450);
            this.Controls.Add(this.menuStrip1);
            this.Controls.Add(this.menuStrip2);
            this.MainMenuStrip = this.menuStrip1;
            this.Name = "Form1";
            this.Text = "Componentes Visuais Básicos";
            this.menuStrip2.ResumeLayout(false);
            this.menuStrip2.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.MenuStrip menuStrip2;
        private System.Windows.Forms.ToolStripMenuItem subMenuArquivo;
        private System.Windows.Forms.ToolStripMenuItem subMenuEditar;
        private System.Windows.Forms.ToolStripMenuItem subMenuAjuda;
        private System.Windows.Forms.ToolStripMenuItem arquivoAbrir;
        private System.Windows.Forms.ToolStripMenuItem arquivoSalvar;
        private System.Windows.Forms.ToolStripMenuItem arquivoSalvarComo;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator1;
        private System.Windows.Forms.ToolStripMenuItem arquivoFechar;
        private System.Windows.Forms.ToolStripMenuItem itemAjuda;
        private System.Windows.Forms.ToolStripMenuItem itemColar;
        private System.Windows.Forms.ToolStripMenuItem itemCopiar;
        private System.Windows.Forms.ToolStripSeparator toolStripSeparator2;
        private System.Windows.Forms.ToolStripMenuItem itemConteudoDeAjuda;
    }
}

