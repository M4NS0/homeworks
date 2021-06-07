
namespace CadastroVacinacao
{
    partial class RecuperarSenha
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
            this.flowLayoutPanel1 = new System.Windows.Forms.FlowLayoutPanel();
            this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            this.label1 = new System.Windows.Forms.Label();
            this.recuperarSenhaUsuario = new System.Windows.Forms.TextBox();
            this.recuperarSenhaFrase = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.tableLayoutPanel2 = new System.Windows.Forms.TableLayoutPanel();
            this.recuperarSenhaFormBtnVoltar = new System.Windows.Forms.Button();
            this.recuperarSenhaFormBtnVerificar = new System.Windows.Forms.Button();
            this.flowLayoutPanel1.SuspendLayout();
            this.tableLayoutPanel1.SuspendLayout();
            this.tableLayoutPanel2.SuspendLayout();
            this.SuspendLayout();
            // 
            // flowLayoutPanel1
            // 
            this.flowLayoutPanel1.Controls.Add(this.tableLayoutPanel1);
            this.flowLayoutPanel1.Controls.Add(this.tableLayoutPanel2);
            this.flowLayoutPanel1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.flowLayoutPanel1.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.flowLayoutPanel1.Location = new System.Drawing.Point(0, 0);
            this.flowLayoutPanel1.Name = "flowLayoutPanel1";
            this.flowLayoutPanel1.Size = new System.Drawing.Size(496, 186);
            this.flowLayoutPanel1.TabIndex = 3;
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.ColumnCount = 2;
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 43.20487F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 56.79513F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Absolute, 20F));
            this.tableLayoutPanel1.Controls.Add(this.label1, 0, 1);
            this.tableLayoutPanel1.Controls.Add(this.recuperarSenhaUsuario, 1, 1);
            this.tableLayoutPanel1.Controls.Add(this.recuperarSenhaFrase, 1, 2);
            this.tableLayoutPanel1.Controls.Add(this.label4, 0, 2);
            this.tableLayoutPanel1.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.tableLayoutPanel1.Location = new System.Drawing.Point(3, 3);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 4;
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 25F));
            this.tableLayoutPanel1.Size = new System.Drawing.Size(493, 137);
            this.tableLayoutPanel1.TabIndex = 0;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.label1.Location = new System.Drawing.Point(140, 39);
            this.label1.Margin = new System.Windows.Forms.Padding(140, 5, 3, 0);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(49, 13);
            this.label1.TabIndex = 5;
            this.label1.Text = "Usuário";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // recuperarSenhaUsuario
            // 
            this.recuperarSenhaUsuario.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.recuperarSenhaUsuario.Location = new System.Drawing.Point(216, 37);
            this.recuperarSenhaUsuario.Name = "recuperarSenhaUsuario";
            this.recuperarSenhaUsuario.Size = new System.Drawing.Size(214, 20);
            this.recuperarSenhaUsuario.TabIndex = 7;
            // 
            // recuperarSenhaFrase
            // 
            this.recuperarSenhaFrase.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.recuperarSenhaFrase.Location = new System.Drawing.Point(216, 71);
            this.recuperarSenhaFrase.Name = "recuperarSenhaFrase";
            this.recuperarSenhaFrase.Size = new System.Drawing.Size(214, 20);
            this.recuperarSenhaFrase.TabIndex = 3;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.label4.Location = new System.Drawing.Point(55, 73);
            this.label4.Margin = new System.Windows.Forms.Padding(55, 5, 3, 0);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(133, 13);
            this.label4.TabIndex = 10;
            this.label4.Text = "Frase de  Recuperação";
            // 
            // tableLayoutPanel2
            // 
            this.tableLayoutPanel2.ColumnCount = 2;
            this.tableLayoutPanel2.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 49.89858F));
            this.tableLayoutPanel2.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 50.10142F));
            this.tableLayoutPanel2.Controls.Add(this.recuperarSenhaFormBtnVoltar, 0, 0);
            this.tableLayoutPanel2.Controls.Add(this.recuperarSenhaFormBtnVerificar, 1, 0);
            this.tableLayoutPanel2.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.tableLayoutPanel2.Location = new System.Drawing.Point(3, 146);
            this.tableLayoutPanel2.Name = "tableLayoutPanel2";
            this.tableLayoutPanel2.RightToLeft = System.Windows.Forms.RightToLeft.No;
            this.tableLayoutPanel2.RowCount = 1;
            this.tableLayoutPanel2.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 100F));
            this.tableLayoutPanel2.Size = new System.Drawing.Size(493, 39);
            this.tableLayoutPanel2.TabIndex = 1;
            // 
            // recuperarSenhaFormBtnVoltar
            // 
            this.recuperarSenhaFormBtnVoltar.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.recuperarSenhaFormBtnVoltar.Location = new System.Drawing.Point(150, 3);
            this.recuperarSenhaFormBtnVoltar.Margin = new System.Windows.Forms.Padding(150, 3, 3, 3);
            this.recuperarSenhaFormBtnVoltar.Name = "recuperarSenhaFormBtnVoltar";
            this.recuperarSenhaFormBtnVoltar.Size = new System.Drawing.Size(89, 30);
            this.recuperarSenhaFormBtnVoltar.TabIndex = 3;
            this.recuperarSenhaFormBtnVoltar.Text = "Voltar";
            this.recuperarSenhaFormBtnVoltar.UseVisualStyleBackColor = true;
            this.recuperarSenhaFormBtnVoltar.Click += new System.EventHandler(this.recuperarSenhaFormBtnVoltar_Click);
            // 
            // recuperarSenhaFormBtnVerificar
            // 
            this.recuperarSenhaFormBtnVerificar.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.recuperarSenhaFormBtnVerificar.Location = new System.Drawing.Point(248, 3);
            this.recuperarSenhaFormBtnVerificar.Name = "recuperarSenhaFormBtnVerificar";
            this.recuperarSenhaFormBtnVerificar.Size = new System.Drawing.Size(89, 30);
            this.recuperarSenhaFormBtnVerificar.TabIndex = 2;
            this.recuperarSenhaFormBtnVerificar.Text = "Verificar";
            this.recuperarSenhaFormBtnVerificar.UseVisualStyleBackColor = true;
            this.recuperarSenhaFormBtnVerificar.Click += new System.EventHandler(this.recuperarSenhaFormBtnVerificar_Click);
            // 
            // RecuperarSenha
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(496, 186);
            this.Controls.Add(this.flowLayoutPanel1);
            this.Name = "RecuperarSenha";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Recupeção de senha";
            this.flowLayoutPanel1.ResumeLayout(false);
            this.tableLayoutPanel1.ResumeLayout(false);
            this.tableLayoutPanel1.PerformLayout();
            this.tableLayoutPanel2.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.FlowLayoutPanel flowLayoutPanel1;
        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private System.Windows.Forms.TextBox recuperarSenhaFrase;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox recuperarSenhaUsuario;
        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel2;
        private System.Windows.Forms.Button recuperarSenhaFormBtnVerificar;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Button recuperarSenhaFormBtnVoltar;
    }
}