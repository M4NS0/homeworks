using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calc
{
    public partial class Form1 : Form
    {
        string txt1, txt2, resposta;
        double d1, d2 = 0.0;

      

        public Form1()
        {
            InitializeComponent();
        }

        private void btn_plus_Click(object sender, EventArgs e)
        {

            txt1 = txt_numero_1.Text;
            txt2 = txt_numero_2.Text;
            
            d1 = Convert.ToDouble(VerifyNull(txt1));
            d2 = Convert.ToDouble(VerifyNull(txt2));

            string operation = "plus";

            txt_resposta.Text = Convert.ToString(Calculus(d1,d2,operation));

        }

        private void btn_times_Click(object sender, EventArgs e)
        {
            txt1 = txt_numero_1.Text;
            txt2 = txt_numero_2.Text;

            d1 = Convert.ToDouble(VerifyNull(txt1));
            d2 = Convert.ToDouble(VerifyNull(txt2));

            string operation = "times";

            txt_resposta.Text = Convert.ToString(Calculus(d1, d2, operation));
        }

        private void btn_divide_Click(object sender, EventArgs e)
        {
            txt1 = txt_numero_1.Text;
            txt2 = txt_numero_2.Text;

            d1 = Convert.ToDouble(VerifyNull(txt1));
            d2 = Convert.ToDouble(VerifyNull(txt2));

            string operation = "divide";

            txt_resposta.Text = Convert.ToString(Calculus(d1, d2, operation));
        }



        private void btn_minus_Click(object sender, EventArgs e)
        {
            txt1 = txt_numero_1.Text;
            txt2 = txt_numero_2.Text;

            d1 = Convert.ToDouble(VerifyNull(txt1));
            d2 = Convert.ToDouble(VerifyNull(txt2));

            string operation = "minus";

            txt_resposta.Text = Convert.ToString(Calculus(d1, d2, operation));

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void btn_CE_Click(object sender, EventArgs e)
        {
            txt_numero_1.Text = "0";
            txt_numero_2.Text = "0";
            d1 = 0;
            d2 = 0;
            txt_resposta.Text = "0";
        }
        private string VerifyNull(string txt)
        {
            if (txt.Equals(""))
            {
                return txt = "0";                
            } else
            {
                return txt;
            }
            throw new NotImplementedException();
        }

        private object Calculus(double d1, double d2, string operation)
        {
            if (operation.Equals("plus"))
            {
                return d1 + d2;
            }
            if (operation.Equals("minus"))
            {
                return d1 - d2;
            }
            if (operation.Equals("times"))
            {
                return d1 * d2;
            }
            if (operation.Equals("divide"))
            {
                return d1 / d2;
            }

            throw new NotImplementedException();
            
            


        }

       

       

       


    }
}
