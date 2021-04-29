
<?php
//http://www.ferdinandiz.com.br/editar_aula12.php?id=10&nome=Vegeta&tel=123-Bulma
	include "conexao_aula12.php";
	echo "<br>";
	
	$id = $_GET["id"];
	$nome = $_GET["nome"];
	$telefone = $_GET["tel"];
	
	$sql = "UPDATE `aula12` SET `nome`= ?,`telefone` = ? WHERE `id` = ?";
	$var = $conexao->prepare($sql);
	$var->bind_param('ssi',$nome,$telefone,$id);
	
	if($var->execute()){
		echo "editado";
	} else echo 'erro';
	
	mysqli_close($conexao);
	
?>