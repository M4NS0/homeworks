

public class Conversao {
	String str = 
			"	<div class=\"mdl-layout mdl-js-layout\">\n" + 
			"		<div class=\"mdl-layout mdl-js-layout\">\n" + 
			"			<main class=\"mdl-layout__content\">\n" + 
			"				<div class=\"mdl-card mdl-shadow--8dp\">\n" + 
			"					<div class=\"mdl-card__title mdl-color--grey-800 mdl-color-text--white\">\n" + 
			"						<h2 class=\"mdl-card__title-text\">Cadastro</h2>\n" + 
			"					</div>\n" + 
			"					<div class=\"mdl-card__supporting-text\">\n" + 
			"						<div class=\"mdl-textfield mdl-js-textfield\">\n" + 
			"							<label	class=\"mdl-textfield__label\">Nome</label>\n" + 
			"							<input class=\"mdl-textfield__input\" type=\"text\" id=\"nomeForm\" required /> \n" + 
			"							\n" + 
			"						</div>\n" + 
			"						<div class=\"mdl-textfield mdl-js-textfield\">\n" + 
			"							<label class=\"mdl-textfield__label\">CPF</label>\n" + 
			"							<input class=\"mdl-textfield__input\" type=\"text\" id=\"cpfForm\" maxlength=\"11\"\n" + 
			"								onblur=\"return validaCPF(this.value)\" required /> \n" + 
			"								\n" + 
			"						</div>\n" + 
			"						<div class=\"mdl-textfield mdl-js-textfield\">\n" + 
			"							<label class=\"mdl-textfield__label\">Nascimento</label>\n" + 
			"							<input class=\"mdl-textfield__input\" type=\"text\" id=\"nascimentoForm\" maxlength=\"10\"\n" + 
			"								onblur=\"return validaData(this.value)\" required /> \n" + 
			"								\n" + 
			"						</div>\n" + 
			"						<div class=\"mdl-textfield mdl-js-textfield\">\n" + 
			"							<label class=\"mdl-textfield__label\">Salário Base</label>\n" + 
			"							<input class=\"mdl-textfield__input\" type=\"text\" id=\"salarioForm\"\n" + 
			"								onblur=\"return validaDecimal(this)\" + required />\n" + 
			"								\n" + 
			"							</div>";
}
