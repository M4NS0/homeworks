<?php
//http://www.ferdinandiz.com.br/inserir_aula12.php?nome=a&tel=b
	include "conexao_aula12.php";
	
	if(isset ($_GET["nome"]) && isset ($_GET["tel"])){
		
		$nome = $_GET["nome"];
		$telefone = $_GET["tel"];
		
		$inserir = "INSERT INTO `aula12`( `nome`, `telefone`) VALUES ('{$nome}','{$telefone}')";
		
		$result = mysqli_query($conexao, $inserir);
		if($result){
			echo 'Contato Inserido!!';
			mysqli_close($conexao);
		} else echo 'Não inserido!!';
			
	}
	else echo "Variaveis não inseridas!";

?>
