
namespace Calc
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
            this.lbl_numero_1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.lbl_resposta = new System.Windows.Forms.Label();
            this.txt_numero_1 = new System.Windows.Forms.TextBox();
            this.txt_numero_2 = new System.Windows.Forms.TextBox();
            this.txt_resposta = new System.Windows.Forms.TextBox();
            this.btn_plus = new System.Windows.Forms.Button();
            this.btn_minus = new System.Windows.Forms.Button();
            this.btn_times = new System.Windows.Forms.Button();
            this.btn_divide = new System.Windows.Forms.Button();
            this.btn_CE = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lbl_numero_1
            // 
            this.lbl_numero_1.AutoSize = true;
            this.lbl_numero_1.Location = new System.Drawing.Point(62, 18);
            this.lbl_numero_1.Name = "lbl_numero_1";
            this.lbl_numero_1.Size = new System.Drawing.Size(53, 13);
            this.lbl_numero_1.TabIndex = 0;
            this.lbl_numero_1.Text = "Número 1";
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(150, 18);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(53, 13);
            this.label2.TabIndex = 1;
            this.label2.Text = "Número 2";
            // 
            // lbl_resposta
            // 
            this.lbl_resposta.AutoSize = true;
            this.lbl_resposta.Location = new System.Drawing.Point(235, 18);
            this.lbl_resposta.Name = "lbl_resposta";
            this.lbl_resposta.Size = new System.Drawing.Size(52, 13);
            this.lbl_resposta.TabIndex = 2;
            this.lbl_resposta.Text = "Resposta";
            // 
            // txt_numero_1
            // 
            this.txt_numero_1.Location = new System.Drawing.Point(48, 34);
            this.txt_numero_1.Name = "txt_numero_1";
            this.txt_numero_1.Size = new System.Drawing.Size(80, 20);
            this.txt_numero_1.TabIndex = 3;
            this.txt_numero_1.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.txt_numero_1.WordWrap = false;
            // 
            // txt_numero_2
            // 
            this.txt_numero_2.Location = new System.Drawing.Point(135, 34);
            this.txt_numero_2.Name = "txt_numero_2";
            this.txt_numero_2.Size = new System.Drawing.Size(80, 20);
            this.txt_numero_2.TabIndex = 4;
            this.txt_numero_2.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.txt_numero_2.WordWrap = false;
            // 
            // txt_resposta
            // 
            this.txt_resposta.Location = new System.Drawing.Point(221, 34);
            this.txt_resposta.Name = "txt_resposta";
            this.txt_resposta.Size = new System.Drawing.Size(80, 20);
            this.txt_resposta.TabIndex = 5;
            this.txt_resposta.TextAlign = System.Windows.Forms.HorizontalAlignment.Center;
            this.txt_resposta.WordWrap = false;
            // 
            // btn_plus
            // 
            this.btn_plus.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_plus.Location = new System.Drawing.Point(36, 60);
            this.btn_plus.Name = "btn_plus";
            this.btn_plus.Size = new System.Drawing.Size(50, 40);
            this.btn_plus.TabIndex = 6;
            this.btn_plus.Text = "+";
            this.btn_plus.UseVisualStyleBackColor = true;
            this.btn_plus.Click += new System.EventHandler(this.btn_plus_Click);
            // 
            // btn_minus
            // 
            this.btn_minus.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_minus.Location = new System.Drawing.Point(92, 60);
            this.btn_minus.Name = "btn_minus";
            this.btn_minus.Size = new System.Drawing.Size(50, 40);
            this.btn_minus.TabIndex = 7;
            this.btn_minus.Text = "-";
            this.btn_minus.UseVisualStyleBackColor = true;
            this.btn_minus.Click += new System.EventHandler(this.btn_minus_Click);
            // 
            // btn_times
            // 
            this.btn_times.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_times.Location = new System.Drawing.Point(148, 60);
            this.btn_times.Name = "btn_times";
            this.btn_times.Size = new System.Drawing.Size(50, 40);
            this.btn_times.TabIndex = 8;
            this.btn_times.Text = "*";
            this.btn_times.UseVisualStyleBackColor = true;
            this.btn_times.Click += new System.EventHandler(this.btn_times_Click);
            // 
            // btn_divide
            // 
            this.btn_divide.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_divide.Location = new System.Drawing.Point(204, 60);
            this.btn_divide.Name = "btn_divide";
            this.btn_divide.Size = new System.Drawing.Size(50, 40);
            this.btn_divide.TabIndex = 9;
            this.btn_divide.Text = "/";
            this.btn_divide.UseVisualStyleBackColor = true;
            this.btn_divide.Click += new System.EventHandler(this.btn_divide_Click);
            // 
            // btn_CE
            // 
            this.btn_CE.Font = new System.Drawing.Font("Microsoft Sans Serif", 14.25F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btn_CE.Location = new System.Drawing.Point(260, 60);
            this.btn_CE.Name = "btn_CE";
            this.btn_CE.Size = new System.Drawing.Size(50, 40);
            this.btn_CE.TabIndex = 10;
            this.btn_CE.Text = "CE";
            this.btn_CE.UseVisualStyleBackColor = true;
            this.btn_CE.Click += new System.EventHandler(this.btn_CE_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(350, 125);
            this.Controls.Add(this.btn_CE);
            this.Controls.Add(this.btn_divide);
            this.Controls.Add(this.btn_times);
            this.Controls.Add(this.btn_minus);
            this.Controls.Add(this.btn_plus);
            this.Controls.Add(this.txt_resposta);
            this.Controls.Add(this.txt_numero_2);
            this.Controls.Add(this.txt_numero_1);
            this.Controls.Add(this.lbl_resposta);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.lbl_numero_1);
            this.Name = "Form1";
            this.Text = "Form1";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbl_numero_1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label lbl_resposta;
        private System.Windows.Forms.TextBox txt_numero_1;
        private System.Windows.Forms.TextBox txt_numero_2;
        private System.Windows.Forms.TextBox txt_resposta;
        private System.Windows.Forms.Button btn_plus;
        private System.Windows.Forms.Button btn_minus;
        private System.Windows.Forms.Button btn_times;
        private System.Windows.Forms.Button btn_divide;
        private System.Windows.Forms.Button btn_CE;
    }
}

