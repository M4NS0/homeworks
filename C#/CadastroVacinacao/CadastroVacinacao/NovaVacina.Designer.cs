
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
            this.inscricaoOrigem = new System.Windows.Forms.TextBox();
            this.inscricaoFabricante = new System.Windows.Forms.TextBox();
            this.inscricaoNomeVacina = new System.Windows.Forms.TextBox();
            this.label4 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label1 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.novoUsuarioFormBtnRegistrar = new System.Windows.Forms.Button();
            this.btnVoltar = new System.Windows.Forms.Button();
            this.btnRemover = new System.Windows.Forms.Button();
            this.flowLayoutPanel1 = new System.Windows.Forms.FlowLayoutPanel();
            this.tableLayoutPanel3 = new System.Windows.Forms.TableLayoutPanel();
            this.dataGridViewVacina = new System.Windows.Forms.DataGridView();
            this.tableLayoutPanel2 = new System.Windows.Forms.TableLayoutPanel();
            this.btnEditar = new System.Windows.Forms.Button();
            this.btnAtualizar = new System.Windows.Forms.Button();
            this.btnNovaVacina = new System.Windows.Forms.Button();
            this.inscricaoDosagem = new System.Windows.Forms.MaskedTextBox();
            this.tableLayoutPanel1.SuspendLayout();
            this.flowLayoutPanel1.SuspendLayout();
            this.tableLayoutPanel3.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewVacina)).BeginInit();
            this.tableLayoutPanel2.SuspendLayout();
            this.SuspendLayout();
            // 
            // tableLayoutPanel1
            // 
            this.tableLayoutPanel1.ColumnCount = 2;
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 40.81081F));
            this.tableLayoutPanel1.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 59.18919F));
            this.tableLayoutPanel1.Controls.Add(this.inscricaoOrigem, 1, 3);
            this.tableLayoutPanel1.Controls.Add(this.inscricaoDosagem, 1, 4);
            this.tableLayoutPanel1.Controls.Add(this.inscricaoFabricante, 1, 2);
            this.tableLayoutPanel1.Controls.Add(this.inscricaoNomeVacina, 1, 1);
            this.tableLayoutPanel1.Controls.Add(this.label4, 0, 4);
            this.tableLayoutPanel1.Controls.Add(this.label2, 0, 3);
            this.tableLayoutPanel1.Controls.Add(this.label1, 0, 2);
            this.tableLayoutPanel1.Controls.Add(this.label3, 0, 1);
            this.tableLayoutPanel1.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.tableLayoutPanel1.Location = new System.Drawing.Point(3, 3);
            this.tableLayoutPanel1.Name = "tableLayoutPanel1";
            this.tableLayoutPanel1.RowCount = 5;
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 53.84615F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 15.38461F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 15.47619F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 15.47619F));
            this.tableLayoutPanel1.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Absolute, 125F));
            this.tableLayoutPanel1.Size = new System.Drawing.Size(351, 295);
            this.tableLayoutPanel1.TabIndex = 0;
            // 
            // inscricaoOrigem
            // 
            this.inscricaoOrigem.Dock = System.Windows.Forms.DockStyle.Left;
            this.inscricaoOrigem.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.inscricaoOrigem.Location = new System.Drawing.Point(146, 146);
            this.inscricaoOrigem.Name = "inscricaoOrigem";
            this.inscricaoOrigem.Size = new System.Drawing.Size(162, 20);
            this.inscricaoOrigem.TabIndex = 2;
            // 
            // inscricaoFabricante
            // 
            this.inscricaoFabricante.Dock = System.Windows.Forms.DockStyle.Left;
            this.inscricaoFabricante.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.inscricaoFabricante.Location = new System.Drawing.Point(146, 120);
            this.inscricaoFabricante.Name = "inscricaoFabricante";
            this.inscricaoFabricante.Size = new System.Drawing.Size(162, 20);
            this.inscricaoFabricante.TabIndex = 1;
            // 
            // inscricaoNomeVacina
            // 
            this.inscricaoNomeVacina.Dock = System.Windows.Forms.DockStyle.Left;
            this.inscricaoNomeVacina.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.inscricaoNomeVacina.Location = new System.Drawing.Point(146, 94);
            this.inscricaoNomeVacina.Name = "inscricaoNomeVacina";
            this.inscricaoNomeVacina.Size = new System.Drawing.Size(162, 20);
            this.inscricaoNomeVacina.TabIndex = 0;
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Dock = System.Windows.Forms.DockStyle.Right;
            this.label4.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.label4.Location = new System.Drawing.Point(61, 172);
            this.label4.Margin = new System.Windows.Forms.Padding(3);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(79, 120);
            this.label4.TabIndex = 9;
            this.label4.Text = "Dosagem (ml)";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Dock = System.Windows.Forms.DockStyle.Right;
            this.label2.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.label2.Location = new System.Drawing.Point(97, 146);
            this.label2.Margin = new System.Windows.Forms.Padding(3);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(43, 20);
            this.label2.TabIndex = 4;
            this.label2.Text = "Origem";
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Dock = System.Windows.Forms.DockStyle.Right;
            this.label1.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.label1.Location = new System.Drawing.Point(73, 120);
            this.label1.Margin = new System.Windows.Forms.Padding(3);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(67, 20);
            this.label1.TabIndex = 5;
            this.label1.Text = "Fabricante";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Dock = System.Windows.Forms.DockStyle.Right;
            this.label3.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.label3.Location = new System.Drawing.Point(109, 94);
            this.label3.Margin = new System.Windows.Forms.Padding(3);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(31, 20);
            this.label3.TabIndex = 6;
            this.label3.Text = "Nome";
            this.label3.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // novoUsuarioFormBtnRegistrar
            // 
            this.novoUsuarioFormBtnRegistrar.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.novoUsuarioFormBtnRegistrar.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.novoUsuarioFormBtnRegistrar.Location = new System.Drawing.Point(322, 3);
            this.novoUsuarioFormBtnRegistrar.Name = "novoUsuarioFormBtnRegistrar";
            this.novoUsuarioFormBtnRegistrar.Size = new System.Drawing.Size(134, 30);
            this.novoUsuarioFormBtnRegistrar.TabIndex = 1;
            this.novoUsuarioFormBtnRegistrar.Text = "Registrar";
            this.novoUsuarioFormBtnRegistrar.UseVisualStyleBackColor = true;
            this.novoUsuarioFormBtnRegistrar.Click += new System.EventHandler(this.novoUsuarioFormBtnRegistrar_Click);
            // 
            // btnVoltar
            // 
            this.btnVoltar.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.btnVoltar.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.btnVoltar.Location = new System.Drawing.Point(16, 3);
            this.btnVoltar.Name = "btnVoltar";
            this.btnVoltar.Size = new System.Drawing.Size(130, 30);
            this.btnVoltar.TabIndex = 0;
            this.btnVoltar.Text = "Voltar";
            this.btnVoltar.UseVisualStyleBackColor = true;
            this.btnVoltar.Click += new System.EventHandler(this.novoUsuarioFormBtnVoltar_Click);
            // 
            // btnRemover
            // 
            this.btnRemover.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.btnRemover.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.btnRemover.Location = new System.Drawing.Point(771, 3);
            this.btnRemover.Name = "btnRemover";
            this.btnRemover.Size = new System.Drawing.Size(130, 30);
            this.btnRemover.TabIndex = 10;
            this.btnRemover.Text = "Remover ";
            this.btnRemover.UseVisualStyleBackColor = true;
            this.btnRemover.Click += new System.EventHandler(this.btnRemover_Click);
            // 
            // flowLayoutPanel1
            // 
            this.flowLayoutPanel1.Controls.Add(this.tableLayoutPanel1);
            this.flowLayoutPanel1.Controls.Add(this.tableLayoutPanel3);
            this.flowLayoutPanel1.Controls.Add(this.tableLayoutPanel2);
            this.flowLayoutPanel1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.flowLayoutPanel1.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.flowLayoutPanel1.Location = new System.Drawing.Point(0, 0);
            this.flowLayoutPanel1.Name = "flowLayoutPanel1";
            this.flowLayoutPanel1.Size = new System.Drawing.Size(942, 357);
            this.flowLayoutPanel1.TabIndex = 2;
            // 
            // tableLayoutPanel3
            // 
            this.tableLayoutPanel3.ColumnCount = 1;
            this.tableLayoutPanel3.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 50F));
            this.tableLayoutPanel3.Controls.Add(this.dataGridViewVacina, 0, 1);
            this.tableLayoutPanel3.Location = new System.Drawing.Point(360, 3);
            this.tableLayoutPanel3.Name = "tableLayoutPanel3";
            this.tableLayoutPanel3.RowCount = 3;
            this.tableLayoutPanel3.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 20.76271F));
            this.tableLayoutPanel3.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 79.23729F));
            this.tableLayoutPanel3.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Absolute, 58F));
            this.tableLayoutPanel3.Size = new System.Drawing.Size(550, 295);
            this.tableLayoutPanel3.TabIndex = 2;
            // 
            // dataGridViewVacina
            // 
            this.dataGridViewVacina.AllowUserToAddRows = false;
            this.dataGridViewVacina.AllowUserToDeleteRows = false;
            this.dataGridViewVacina.AllowUserToOrderColumns = true;
            this.dataGridViewVacina.AllowUserToResizeColumns = false;
            this.dataGridViewVacina.AllowUserToResizeRows = false;
            this.dataGridViewVacina.AutoSizeColumnsMode = System.Windows.Forms.DataGridViewAutoSizeColumnsMode.Fill;
            this.dataGridViewVacina.BackgroundColor = System.Drawing.SystemColors.ControlLightLight;
            this.dataGridViewVacina.ColumnHeadersHeightSizeMode = System.Windows.Forms.DataGridViewColumnHeadersHeightSizeMode.AutoSize;
            this.dataGridViewVacina.Dock = System.Windows.Forms.DockStyle.Fill;
            this.dataGridViewVacina.Location = new System.Drawing.Point(3, 52);
            this.dataGridViewVacina.Name = "dataGridViewVacina";
            this.dataGridViewVacina.ReadOnly = true;
            this.dataGridViewVacina.SelectionMode = System.Windows.Forms.DataGridViewSelectionMode.FullRowSelect;
            this.dataGridViewVacina.ShowEditingIcon = false;
            this.dataGridViewVacina.Size = new System.Drawing.Size(544, 181);
            this.dataGridViewVacina.TabIndex = 3;
            this.dataGridViewVacina.CellContentClick += new System.Windows.Forms.DataGridViewCellEventHandler(this.dataGridViewVacina_CellContentClick);
            // 
            // tableLayoutPanel2
            // 
            this.tableLayoutPanel2.ColumnCount = 6;
            this.tableLayoutPanel2.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 51.85185F));
            this.tableLayoutPanel2.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Percent, 48.14815F));
            this.tableLayoutPanel2.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Absolute, 151F));
            this.tableLayoutPanel2.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Absolute, 149F));
            this.tableLayoutPanel2.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Absolute, 152F));
            this.tableLayoutPanel2.ColumnStyles.Add(new System.Windows.Forms.ColumnStyle(System.Windows.Forms.SizeType.Absolute, 140F));
            this.tableLayoutPanel2.Controls.Add(this.novoUsuarioFormBtnRegistrar, 2, 0);
            this.tableLayoutPanel2.Controls.Add(this.btnRemover, 5, 0);
            this.tableLayoutPanel2.Controls.Add(this.btnEditar, 3, 0);
            this.tableLayoutPanel2.Controls.Add(this.btnAtualizar, 4, 0);
            this.tableLayoutPanel2.Controls.Add(this.btnVoltar, 0, 0);
            this.tableLayoutPanel2.Controls.Add(this.btnNovaVacina, 1, 0);
            this.tableLayoutPanel2.Location = new System.Drawing.Point(3, 304);
            this.tableLayoutPanel2.Name = "tableLayoutPanel2";
            this.tableLayoutPanel2.RowCount = 1;
            this.tableLayoutPanel2.RowStyles.Add(new System.Windows.Forms.RowStyle(System.Windows.Forms.SizeType.Percent, 50F));
            this.tableLayoutPanel2.Size = new System.Drawing.Size(907, 36);
            this.tableLayoutPanel2.TabIndex = 1;
            // 
            // btnEditar
            // 
            this.btnEditar.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.btnEditar.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.btnEditar.Location = new System.Drawing.Point(474, 3);
            this.btnEditar.Name = "btnEditar";
            this.btnEditar.Size = new System.Drawing.Size(130, 30);
            this.btnEditar.TabIndex = 12;
            this.btnEditar.Text = "Editar";
            this.btnEditar.UseVisualStyleBackColor = true;
            this.btnEditar.Click += new System.EventHandler(this.btnEditar_Click_1);
            // 
            // btnAtualizar
            // 
            this.btnAtualizar.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.btnAtualizar.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.btnAtualizar.Location = new System.Drawing.Point(625, 3);
            this.btnAtualizar.Name = "btnAtualizar";
            this.btnAtualizar.Size = new System.Drawing.Size(130, 30);
            this.btnAtualizar.TabIndex = 11;
            this.btnAtualizar.Text = "Atualizar";
            this.btnAtualizar.UseVisualStyleBackColor = true;
            this.btnAtualizar.Click += new System.EventHandler(this.btnEditar_Click);
            // 
            // btnNovaVacina
            // 
            this.btnNovaVacina.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.btnNovaVacina.Font = new System.Drawing.Font("Consolas", 8.25F);
            this.btnNovaVacina.Location = new System.Drawing.Point(173, 3);
            this.btnNovaVacina.Name = "btnNovaVacina";
            this.btnNovaVacina.Size = new System.Drawing.Size(130, 30);
            this.btnNovaVacina.TabIndex = 13;
            this.btnNovaVacina.Text = "Nova";
            this.btnNovaVacina.UseVisualStyleBackColor = true;
            this.btnNovaVacina.Click += new System.EventHandler(this.btnNovaVacina_Click_1);
            // 
            // inscricaoDosagem
            // 
            this.inscricaoDosagem.Location = new System.Drawing.Point(146, 172);
            this.inscricaoDosagem.Mask = "0,0";
            this.inscricaoDosagem.Name = "inscricaoDosagem";
            this.inscricaoDosagem.Size = new System.Drawing.Size(86, 20);
            this.inscricaoDosagem.TabIndex = 4;
            // 
            // NovaVacina
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(942, 357);
            this.Controls.Add(this.flowLayoutPanel1);
            this.Name = "NovaVacina";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Inscrição de Vacinas";
            this.tableLayoutPanel1.ResumeLayout(false);
            this.tableLayoutPanel1.PerformLayout();
            this.flowLayoutPanel1.ResumeLayout(false);
            this.tableLayoutPanel3.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.dataGridViewVacina)).EndInit();
            this.tableLayoutPanel2.ResumeLayout(false);
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
        private System.Windows.Forms.FlowLayoutPanel flowLayoutPanel1;
        private System.Windows.Forms.Button btnVoltar;
        private System.Windows.Forms.Button novoUsuarioFormBtnRegistrar;
        private System.Windows.Forms.Button btnRemover;
        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel2;
        private System.Windows.Forms.TableLayoutPanel tableLayoutPanel3;
        private System.Windows.Forms.DataGridView dataGridViewVacina;
        private System.Windows.Forms.Button btnAtualizar;
        private System.Windows.Forms.Button btnEditar;
        private System.Windows.Forms.Button btnNovaVacina;
        private System.Windows.Forms.MaskedTextBox inscricaoDosagem;
    }
}