<a name="readme-top"></a>

# Desafio Técnico - UI - QA

![Intellij](https://img.shields.io/badge/Intellij-logo?style=flat-square&color=%23000000)
![Java](https://img.shields.io/badge/JAVA_17-logo?style=flat-square&color=%23FF7800)
![RestAssured](https://img.shields.io/badge/RestAssured-logo?style=flat-square&color=%234EA94B)
![Junit](https://img.shields.io/badge/Junit-logo?style=flat-square&color=%2314692E)
![Lombok](https://img.shields.io/badge/Lombok-logo?style=flat-square&color=grey)
![Allure](https://img.shields.io/badge/Allure-logo?style=flat-square&color=%23FF4500)

Este projeto consiste em um desafio técnico para demonstrar conhecimentos acerca de Automação de Testes em UI. A
aplicação de exemplo a ser utilizada é [BugBank](https://bugbank.netlify.app/).

## Rodar o projeto localmente

1. Clone o repositorio

```ssh
git clone https://github.com/bscarpari/test-qa-ui.git
```

2. Entre na pasta criada

```ssh
cd test-qa-ui
``` 

3. Abra o projeto na IDE IntelliJ

4. Certifique de configurar o SDK do projeto para Java 17

```text
File > Project Structure > Project > Project SDK > 17
```

5. Para rodar todos os testes de uma só vez:

```text
a. Acesse a dependência lateral direita "Maven"
b. Abra o Lifecycle
c. Execute o comando "test"
```

**OBS.:** execute todos os testes para depois gerar o relatório

6. Para gerar e visualizar o relatório de cobertura de testes:

```text
1. Acesse o terminal da IDE
2. Execute o comando "allure generate --clean"
3. Execute o comando "allure open"
```

**OBS.:** precisa ter o Allure instalado na máquina. Caso não tenha, siga as
instruções [aqui](https://docs.qameta.io/allure/)

## Responsável

<table>
    <tr>
      <td align="center">
        <a href="https://github.com/bscarpari">
          <img src="https://avatars.githubusercontent.com/u/53575457?v=4" width="100px;" /><br>
          <sub>
            <b>Bruno Scarpari</b>
          </sub>
        </a>
      </td>
    </tr>
</table>

## Cobertura de testes

- [X] Cenário 1: Realizar cadastro
- [X] Cenário 2: Realizar login
- [X] Cenário 3: Realizar transferência entre contas

## Licença

[MIT](https://choosealicense.com/licenses/mit/)

<p align="right">(<a href="#readme-top">voltar para o topo</a>)</p>
