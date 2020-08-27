
### TomCat Eclipse Installation

1. Baixe a versão 8.5 do Tomcat na pagina
2. Abra o Eclipse
3. File > New > Dinamyc Web Project
4. Insira o nome do Projeto (ex:. ProjetoWeb)
5. Clique em "New Runtime"
* Escolha a versão apropriada do Tomcat
* Marque a caixa "create a new local server"
* FINISH
6. NEXT
* Escolha a pasta SRC
7. NEXT
8. Marque a caixa  "Generate web.xml deployment descriptor"
9. FINISH

###### Criando o Servidor
10. No Eclipse:  Window > Show View > Server
11. Clique em "New Server"
12. Arraste o projeto para direita (ProjetoWeb)
13. FINISH
14. Na pasta WebContent crie o documento index.jsp, insira o código abaixo:
```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jsp</title>
</head>
<body>
Primeira pagina jsp
</body>
</html>

```
15. Rode apartir da página principal

##### Criando Servlets

16. Em src clique botão direito e selecione New > Servlet
17. Em Java Package > Browse selecione (default package)
18. Escolha o nome do Servlet (ex:. ServletHello)
19. FINISH
20. Altere o Arquivo criado, substituindo o método, a seguir:
```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().print("Olá Mundo, Usando Servlets");
	}
```
21. Teste o Servlet clicando com botão direito > Run

##### Exemplo de aplicação com Servlet
1. No arquivo "ServletHello.java" altere o seguinte método: 
```java
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// response.getWriter().print("Olá Mundo, Usando Servlets");
		String nome = request.getParameter("nome");
		int idade = Integer.parseInt(request.getParameter("idade"));
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print("Olá, " + nome + " sua idade é: " + idade);
	}
```
2. Rode a aplicação em: http://localhost:8282/ProjetoWeb/ServletHello?nome=Carlos&idade=30

##### Exemplo 2 de aplicação com Servlet
1. Crie o arquivo pag-01.html na pasta WebContent
2. Insira o código abaixo:
```html
<<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="http://localhost:8282/ProjetoWeb/ServletHello02">
	Nome: <input type="text" name="nome"/>
	Idade: <input type="text" name="idade"/>
	<input type="submit" name="enviar" value="Enviar"/>
	</form>
</body>
</html>
```
3. Crie um arquivo ServletHello02.java em src 
4. Em src clique botão direito e selecione New > Servlet
5. Em Java Package > Browse selecione (default package)
6. Escolha o nome do Servlet (ex:. ServletHello02)
7. FINISH
8. Altere o Arquivo criado, substituindo os métodos, a seguir:
```java
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		// response.getWriter().print("Olá Mundo, Usando Servlets");
		String nome = request.getParameter("nome");
		int idade = Integer.parseInt(request.getParameter("idade"));
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().print("Recebendo via post - " + nome + " sua idade é: " + idade);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

```
9. Rode o documento pag-01.html


<br>
<br>
<br>
<br>


###### Alternative: TomCat Server Installation

1. Installing JDK
```sh
sudo apt install default-jdk
```
2. Creating Tomcat user
```sh
sudo groupadd tomcat
sudo useradd -s /bin/false -g tomcat -d /opt/tomcat tomcat
```
3. Installing TomCat via website link [Tomcat](http://tomcat.apache.org/) (8.5 version)
```sh
cd /tmp
curl -O http://mirror.nbtelecom.com.br/apache/tomcat/tomcat-8/v8.5.57/bin/apache-tomcat-8.5.57.tar.gz 
```
4. Installing TomCat's directories
```sh
sudo mkdir /opt/tomcat
sudo tar xzvf apache-tomcat-*tar.gz -C /opt/tomcat --strip-components=1
```
5. Setting up TomCat folder and group permissions:
```sh
cd /opt/tomcat
sudo chgrp -R tomcat /opt/tomcat
sudo chmod -R g+r conf
sudo chmod g+x conf
```
6. Making TomCat's user the proprietary of folders webapps, work, temp and logs, in same directory from above
```sh
sudo chown -R tomcat webapps/ work/ temp/ logs/
```

7. Finding where is jdk folder in your system:
```sh
sudo update-java-alternatives -l
```
8. Creating Systemd service 
```sh
sudo nano /etc/systemd/system/tomcat.service
```
9. Paste the code placing the correct path target after JAVA_HOME:
```java
[Unit]
Description=Apache Tomcat Web Application Container
After=network.target

[Service]
Type=forking

Environment=JAVA_HOME=/usr/lib/jvm/java-1.11.0-openjdk-amd64
Environment=CATALINA_PID=/opt/tomcat/temp/tomcat.pid
Environment=CATALINA_HOME=/opt/tomcat
Environment=CATALINA_BASE=/opt/tomcat
Environment='CATALINA_OPTS=-Xms512M -Xmx1024M -server -XX:+UseParallelGC'
Environment='JAVA_OPTS=-Djava.awt.headless=true -Djava.security.egd=file:/dev/./urandom'

ExecStart=/opt/tomcat/bin/startup.sh
ExecStop=/opt/tomcat/bin/shutdown.sh

User=tomcat
Group=tomcat
UMask=0007
RestartSec=10
Restart=always

[Install]
WantedBy=multi-user.target
```
10. Reloading TomCat
```sh 
sudo systemctl daemon-reload
```
11. Starting TomCat's Services
```sh
sudo systemctl start tomcat
sudo systemctl status tomcat
```
12. Setting up Firewall
```sh
sudo ufw allow 8080
```
13. Getting machine ip
```sh
ifconfig
```
14. Testing http://server_domain_or_IP:8080
15. Enabling TomCat
```sh
sudo systemctl enable tomcat
```
16. Configuring managing interfaces
```sh
sudo nano /opt/tomcat/conf/tomcat-users.xml
```
17. Paste the code (override all)
```xml
<?xml version="1.0" encoding="UTF-8"?>
<tomcat-users>
  <role rolename="manager-gui"/>
  <role rolename="manager-script"/>
  <role rolename="manager-jmx"/>
  <role rolename="manager-status"/>
  <role rolename="admin-gui"/>
  <role rolename="admin-script"/>
  <user username="tomcat" password="s3cret" roles="manager-gui,manager-script,manager-jmx,manager-status,admin-gui,admin-script"/>
</tomcat-users>
```
18. Configuring app Manager
```sh
sudo nano /opt/tomcat/webapps/manager/META-INF/context.xml
```
19. Paste the code (override all)
```xml
<?xml version="1.0" encoding="UTF-8"?>
 <Context antiResourceLocking="false" privileged="true" >
 <!-- <Valve className="org.apache.catalina.valves.RemoteAddrValve" allow="127\.\d+\.\d+\.\d+|::1|0:0:0:0:0:0:0:1" /> -->
 <Manager sessionAttributeValueClassNameFilter="java\.lang\.(?:Boolean|Integer|Long|Number|String)|org\.apache\.catalina\.filters\.CsrfPreventionFilter\ruCache(?:\)?|java\.util\.(?:Linked)?HashMap"/>
</Context>
```
20. Configuring Host Manager
```sh
sudo nano /opt/tomcat/webapps/host-manager/META-INF/context.xml
```
21. Paste the code (override all)
```xml
<?xml version="1.0" encoding="UTF-8"?>
 <Context antiResourceLocking="false" privileged="true" >
<!--<Valve className="org.apache.catalina.valves.RemoteAddrValve" allow="127\.\d+\.\d+\.\d+|::1|0:0:0:0:0:0:0:1" />-->
 <Manager sessionAttributeValueClassNameFilter="java\.lang\.(?:Boolean|Integer|Long|Number|String)|org\.apache\.catalina\.filters\.CsrfPreventionFilter\ruCache(?:\)?|java\.util\.(?:Linked)?HashMap"/>
</Context>
```
22. Restarting Services
```sh
sudo systemctl restart tomcat
```
23. Testing both access

	http://server_domain_or_IP:8080/manager/html

	http://server_domain_or_IP:8080/host-manager/html/


> Attention: Stop machine server to use Eclipse Services
> to start server 
```sh
sudo su
bash /opt/tomcat/bin/startup.sh
```

>to stop server
```sh
sudo su
bash /opt/tomcat/bin/shutdown.sh
```
