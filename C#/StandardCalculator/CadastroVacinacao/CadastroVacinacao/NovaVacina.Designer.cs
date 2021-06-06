
namespace CadastroVacinacao
{
    partial class NovaVacina
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
            this.tableLayoutPanel1 = new System.Windows.Forms.TableLayoutPanel();
            this.novoUsuarioFormBtnRegistrar = new System.Windows.Forms.Button();
            this.novoUsuarioFormBtnVoltar = new System.Windows.Forms.Button();
            this.inscricaoDosagem = new System.Windows.Forms.TextBox();
            this.inscricaoOrigem = new System.Windows.Forms.TextBox();
            this.inscricaoFabricante = new System.Windows.Forms.TextBox();
            this.inscricaoNomeVacina = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.btnRemover = new System.Windows.Forms.Button();
            this.label5 = new System.Windows.Forms.Label();
            this.delecaoPorId = new System.Windows.Forms.TextBox();
            this.flowLayoutPanel1 = new System.Windows.Forms.FlowLayoutPanel();
            this.tableLayoutPanel1.SuspendLayout();
            this.flowLayoutPanel1.SuspendLayout();
            this.SuspendLayout();
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.ColumnCount = 5;
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 48.17073F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 51.82927F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Absolute, 143F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Absolute, 153F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Absolute, 118F));
            this.tableLayoutPanel1.Controls.Add(this.novoUsuarioFormBtnRegistrar, 1, 5);
            this.tableLayoutPanel1.Controls.Add(this.novoUsuarioFormBtnVoltar, 0, 5);
            this.tableLayoutPanel1.Controls.Add(this.inscricaoDosagem, 1, 4);
            this.tableLayoutPanel1.Controls.Add(this.inscricaoOrigem, 1, 3);
            this.tableLayoutPanel1.Controls.Add(this.inscricaoFabricante, 1, 2);
            this.tableLayoutPanel1.Controls.Add(this.inscricaoNomeVacina, 1, 1);
            this.tableLayoutPanel1.Controls.Add(this.label4, 0, 4);
            this.tableLayoutPanel1.Controls.Add(this.label2, 0, 3);
            this.tableLayoutPanel1.Controls.Add(this.label1, 0, 2);
            this.tableLayoutPanel1.Controls.Add(this.label3, 0, 1);
            this.tableLayoutPanel1.Controls.Add(this.delecaoPorId, 3, 3);
            this.tableLayoutPanel1.Controls.Add(this.label5, 2, 3);
            this.tableLayoutPanel1.Controls.Add(this.btnRemover, 3, 5);
            this.tableLayoutPanel1.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.tableLayoutPanel1.Location = new System.Drawing.Point(3, 3);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 6;
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 43.47826F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 17.48252F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 19.58042F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 19.58042F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Absolute, 117F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Absolute, 35F));
            this.tableLayoutPanel1.Size = new System.Drawing.Size(907, 295);
            this.tableLayoutPanel1.TabIndex = 0;
            // 
            // novoUsuarioFormBtnRegistrar
            // 
            this.novoUsuarioFormBtnRegistrar.Dock = System.Windows.Forms.DockStyle.Left;
            this.novoUsuarioFormBtnRegistrar.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.novoUsuarioFormBtnRegistrar.Location = new System.Drawing.Point(240, 260);
            this.novoUsuarioFormBtnRegistrar.Name = "novoUsuarioFormBtnRegistrar";
            this.novoUsuarioFormBtnRegistrar.Size = new System.Drawing.Size(83, 32);
            this.novoUsuarioFormBtnRegistrar.TabIndex = 1;
            this.novoUsuarioFormBtnRegistrar.Text = "Registrar";
            this.novoUsuarioFormBtnRegistrar.UseVisualStyleBackColor = true;
            this.novoUsuarioFormBtnRegistrar.Click += new System.EventHandler(this.novoUsuarioFormBtnRegistrar_Click);
            // 
            // novoUsuarioFormBtnVoltar
            // 
            this.novoUsuarioFormBtnVoltar.Dock = System.Windows.Forms.DockStyle.Right;
            this.novoUsuarioFormBtnVoltar.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.novoUsuarioFormBtnVoltar.Location = new System.Drawing.Point(151, 260);
            this.novoUsuarioFormBtnVoltar.Name = "novoUsuarioFormBtnVoltar";
            this.novoUsuarioFormBtnVoltar.Size = new System.Drawing.Size(83, 32);
            this.novoUsuarioFormBtnVoltar.TabIndex = 0;
            this.novoUsuarioFormBtnVoltar.Text = "Voltar";
            this.novoUsuarioFormBtnVoltar.UseVisualStyleBackColor = true;
            this.novoUsuarioFormBtnVoltar.Click += new System.EventHandler(this.novoUsuarioFormBtnVoltar_Click);
            // 
            // inscricaoDosagem
            // 
            this.inscricaoDosagem.Dock = System.Windows.Forms.DockStyle.Left;
            this.inscricaoDosagem.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.inscricaoDosagem.Location = new System.Drawing.Point(240, 143);
            this.inscricaoDosagem.Name = "inscricaoDosagem";
            this.inscricaoDosagem.Size = new System.Drawing.Size(83, 20);
            this.inscricaoDosagem.TabIndex = 3;
            // 
            // inscricaoOrigem
            // 
            this.inscricaoOrigem.Dock = System.Windows.Forms.DockStyle.Left;
            this.inscricaoOrigem.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.inscricaoOrigem.Location = new System.Drawing.Point(240, 116);
            this.inscricaoOrigem.Name = "inscricaoOrigem";
            this.inscricaoOrigem.Size = new System.Drawing.Size(162, 20);
            this.inscricaoOrigem.TabIndex = 2;
            // 
            // inscricaoFabricante
            // 
            this.inscricaoFabricante.Dock = System.Windows.Forms.DockStyle.Left;
            this.inscricaoFabricante.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.inscricaoFabricante.Location = new System.Drawing.Point(240, 89);
            this.inscricaoFabricante.Name = "inscricaoFabricante";
            this.inscricaoFabricante.Size = new System.Drawing.Size(162, 20);
            this.inscricaoFabricante.TabIndex = 1;
            // 
            // inscricaoNomeVacina
            // 
            this.inscricaoNomeVacina.Dock = System.Windows.Forms.DockStyle.Left;
            this.inscricaoNomeVacina.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.inscricaoNomeVacina.Location = new System.Drawing.Point(240, 65);
            this.inscricaoNomeVacina.Name = "inscricaoNomeVacina";
            this.inscricaoNomeVacina.Size = new System.Drawing.Size(162, 20);
            this.inscricaoNomeVacina.TabIndex = 0;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Dock = System.Windows.Forms.DockStyle.Right;
            this.label4.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.label4.Location = new System.Drawing.Point(155, 143);
            this.label4.Margin = new System.Windows.Forms.Padding(3);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(79, 111);
            this.label4.TabIndex = 9;
            this.label4.Text = "Dosagem (ml)";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Dock = System.Windows.Forms.DockStyle.Right;
            this.label2.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.label2.Location = new System.Drawing.Point(191, 116);
            this.label2.Margin = new System.Windows.Forms.Padding(3);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(43, 21);
            this.label2.TabIndex = 4;
            this.label2.Text = "Origem";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Dock = System.Windows.Forms.DockStyle.Right;
            this.label1.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.label1.Location = new System.Drawing.Point(167, 89);
            this.label1.Margin = new System.Windows.Forms.Padding(3);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(67, 21);
            this.label1.TabIndex = 5;
            this.label1.Text = "Fabricante";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Dock = System.Windows.Forms.DockStyle.Right;
            this.label3.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.label3.Location = new System.Drawing.Point(203, 65);
            this.label3.Margin = new System.Windows.Forms.Padding(3);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(31, 18);
            this.label3.TabIndex = 6;
            this.label3.Text = "Nome";
            this.label3.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // btnRemover
            // 
            this.btnRemover.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.btnRemover.Location = new System.Drawing.Point(670, 260);
            this.btnRemover.Margin = new System.Windows.Forms.Padding(35, 3, 3, 3);
            this.btnRemover.Name = "btnRemover";
            this.btnRemover.Size = new System.Drawing.Size(83, 31);
            this.btnRemover.TabIndex = 10;
            this.btnRemover.Text = "Remover ";
            this.btnRemover.UseVisualStyleBackColor = true;
            this.btnRemover.Click += new System.EventHandler(this.btnRemover_Click);
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Dock = System.Windows.Forms.DockStyle.Right;
            this.label5.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.label5.Location = new System.Drawing.Point(613, 118);
            this.label5.Margin = new System.Windows.Forms.Padding(3, 5, 3, 0);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(19, 22);
            this.label5.TabIndex = 11;
            this.label5.Text = "ID";
            this.label5.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // delecaoPorId
            // 
            this.delecaoPorId.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.delecaoPorId.Location = new System.Drawing.Point(638, 116);
            this.delecaoPorId.Name = "delecaoPorId";
            this.delecaoPorId.Size = new System.Drawing.Size(147, 20);
            this.delecaoPorId.TabIndex = 14;
            // 
            // flowLayoutPanel1
            // 
            this.flowLayoutPanel1.Controls.Add(this.tableLayoutPanel1);
            this.flowLayoutPanel1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.flowLayoutPanel1.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.flowLayoutPanel1.Location = new System.Drawing.Point(0, 0);
            this.flowLayoutPanel1.Name = "flowLayoutPanel1";
            this.flowLayoutPanel1.Size = new System.Drawing.Size(943, 325);
            this.flowLayoutPanel1.TabIndex = 2;
            // 
            // NovaVacina
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(943, 325);
            this.Controls.Add(this.flowLayoutPanel1);
            this.Name = "NovaVacina";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Inscrição de Vacinas";
            this.tableLayoutPanel1.ResumeLayout(false);
            this.tableLayoutPanel1.PerformLayout();
            this.flowLayoutPanel1.ResumeLayout(false);
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel1;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox inscricaoOrigem;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.TextBox inscricaoFabricante;
        private System.Windows.Forms.TextBox inscricaoNomeVacina;
        private System.Windows.Forms.TextBox inscricaoDosagem;
        private System.Windows.Forms.FlowLayoutPanel flowLayoutPanel1;
        private System.Windows.Forms.Button novoUsuarioFormBtnVoltar;
        private System.Windows.Forms.Button novoUsuarioFormBtnRegistrar;
        private System.Windows.Forms.Button btnRemover;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.TextBox delecaoPorId;
    }
}