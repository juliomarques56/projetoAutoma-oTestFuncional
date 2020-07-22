# Projeto Automação Teste Funcional
## Objetivo
O projeto consiste na automação de teste funcional de API e de interface Web, validandos campos específicos.

## Teste de interface web
#### Onde será testado?<br />
http://165.227.93.41/lojinha-web Sistema web.

#### Usuário para login<br />
Será usado tanto para o teste de interface web quanto para API.<br />
- user: admin<br />
- password: admin

 ### Teste 1<br />
 #### Validar dados de um produto.<br />
 - Produto "PS4"<br />
 #### Campos a serem validados.
 - Nome do produto.
 - Nome do primeiro componente.
 
 ### Teste 2 <br />
 #### Cadastrar um novo produto. <br />
 - Produto "NITENDO 64"<br />
  #### Campos a serem preenchidos.
  - Nome do produdo.
  - Valor do produto.
  - Cores do produto.
  - Validar se a mensagem "Produto adicionado com sucesso" foi apresentada apos clicar em salvar.
  
  ## Configurações:
  Foi desenvolvido em `Java`.<br />
  Dependencias: `Junit` e `Selenium`.<br />
  IDE: `Intellij IDE`<br />
  Nescessário baixar o Chormedriver. Foi usado o navegador Google Chorme versão 84.<br />
  Obs: Verifique a versão do seu navegador chorme e baixe Chormedriver de acordo com a versão. Link download chormecriver https://chromedriver.chromium.org/downloads<br />
  Apos baixar, recomendo que crie uma pasta com nome `Temp` e dentro dela crie outra pasta com nome `drivers` no diretorio c: (Windows), caso não tenha a pasta `Temp`. Descompactar arquivo na pasta `drivers`
  
  -------------------------------------------
  ## Teste de API
  #### Onde será testado?<br />
http://165.227.93.41/lojinha-web Lojinha API.

#### Usuário para login<br />
Será usado tanto para o teste de interface web quanto para API.<br />
- user: admin<br />
- password: admin
- Será capturado o token do usuário.

 ### Teste 1<br />
 #### Buscar dados de um produto específico.<br />
 - Produto "PSP4"<br />
 #### Campos a serem validados.
 - Status da responta
 - Nome do produto.
 - Nome do primeiro componente.
 - Mensagem "Detalhando dados do produto".
 
  ### Teste 2<br />
 #### Buscar dados de um componente de produto.<br />
 #### Campos a serem validados.
 - Status da responta
 - Nome do componente.
 - Quantidade do componente.
 - Mensagem "Detalhando dados do componente de produto".
 
 ## Configurações:
  Foi desenvolvido em `Java`.<br />
  Dependencias: `Junit` e `RestAssured`.<br />
  IDE: `Intellij IDE`<br />
  
  ## Videos dos testes
 - Na pasta evidencias tem o video dos testes sendo executados.
