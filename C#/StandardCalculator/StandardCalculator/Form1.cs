using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Text.RegularExpressions;

namespace StandardCalculator
{
    public partial class Calculadora : Form
    {
        private double firstNumber;
        private string operation;
        private double secondNumber;

        public Calculadora()
        {
            InitializeComponent();
        }

        private void btn0_Click(object sender, EventArgs e)
        {
            ecra.Text += "0";
        }

        private void btn1_Click(object sender, EventArgs e)
        {
            ecra.Text += "1";
        }

        private void btn2_Click(object sender, EventArgs e)
        {
            ecra.Text += "2";
        }

        private void btn3_Click(object sender, EventArgs e)
        {
            ecra.Text += "3";
        }

        private void btn4_Click(object sender, EventArgs e)
        {
            ecra.Text += "4";
        }

        private void btn5_Click(object sender, EventArgs e)
        {
            ecra.Text += "5";
        }

        private void btn6_Click(object sender, EventArgs e)
        {
            ecra.Text += "6";
        }

        private void btn7_Click(object sender, EventArgs e)
        {
            ecra.Text += "7";
        }

        private void btn8_Click(object sender, EventArgs e)
        {
            ecra.Text += "8";
        }

        private void btn9_Click(object sender, EventArgs e)
        {
            ecra.Text += "9";
        }
        private void btn_dot_Click(object sender, EventArgs e)
        {   
            if (ecra.Text.Contains("."))
            {
                return;
            }
            else
            {
                if (ecra.Text.Equals(""))
                {
                    ecra.Text += "0.";
                }
                else
                {
                    ecra.Text += ".";
                }
            }

            if (ecra.Text.Contains("00.") || ecra.Text.Contains("000.") || ecra.Text.Contains("0000.") || ecra.Text.Contains("00000.") || ecra.Text.Contains("000000."))
            {
                ecra.Text = "0.";
            }

            /// ecra.Text = Convert.ToDecimal(Convert.ToDouble(ecra.Text)).ToString("F1");


        }



        private void btn_CE_Click(object sender, EventArgs e)
        {
            ecra.Text = "0";
            firstNumber = 0;
            secondNumber = 0;
            ecra_operadores.Text = "CE";
        }

        private void btn_backspace_Click(object sender, EventArgs e)
        {
            ecra.Text = ecra.Text.Substring(0, ecra.Text.Length - 1);

        }

        private void btn_plus_Click(object sender, EventArgs e)
        {
            if (ecra.Text.Equals(""))
            {
                ecra.Text.Equals("0");
            } else
            {
                firstNumber = Convert.ToDouble(ecra.Text);
                ecra.Text = "0";
                operation = "+";
                ecra_operadores.Text = operation;
            }

        }

        private void minus_Click(object sender, EventArgs e)
        {
            if (ecra.Text.Equals(""))
            {
                ecra.Text.Equals("0");
            }
            else
            {
                firstNumber = Convert.ToDouble(ecra.Text);
                ecra.Text = "0";
                operation = "-";
                ecra_operadores.Text = operation;
            }
        }
        private void btn_times_Click(object sender, EventArgs e)
        {
            if (ecra.Text.Equals(""))
            {
                ecra.Text.Equals("0");
            }
            else
            {
                firstNumber = Convert.ToDouble(ecra.Text);
                ecra.Text = "0";
                operation = "*";
                ecra_operadores.Text = operation;
            }
        }

        private void btn_divide_Click(object sender, EventArgs e)
        {
            if (ecra.Text.Equals(""))
            {
                ecra.Text.Equals("0");
            }
            else
            {
                firstNumber = Convert.ToDouble(ecra.Text);
                ecra.Text = "0";
                operation = "/";
                ecra_operadores.Text = operation;
            }
        }
        private void btn_equal_Click(object sender, EventArgs e)
        {
            double result;

            secondNumber = Convert.ToDouble(ecra.Text);
            ecra_operadores.Text = "=";

            if (operation.Equals("+"))
            {
                result = (firstNumber + secondNumber);
                ecra.Text = Convert.ToString(result);
                firstNumber = result;
            }
            if (operation.Equals("-"))
            {
                result = (firstNumber - secondNumber);
                ecra.Text = Convert.ToString(result);
                firstNumber = result;
            }
            if (operation.Equals("*"))
            {
                result = (firstNumber * secondNumber);
                ecra.Text = Convert.ToString(result);
                firstNumber = result;
            }
            if (operation.Equals("/"))
            {
                if (secondNumber == 0)
                {
                    ecra.Text = "err";
                }
                else
                {
                    result = (firstNumber / secondNumber);
                    ecra.Text = Convert.ToString(result);
                    firstNumber = result;
                }
            }           
        }
    }
}
