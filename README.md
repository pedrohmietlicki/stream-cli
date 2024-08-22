# Introdução do Projeto
O projeto consiste em uma aplicação Java que permite a reprodução de arquivos de áudio e vídeo a partir do terminal. Utilizando conceitos de Programação Orientada a Objetos (POO), como polimorfismo, herança, encapsulamento e interfaces, o sistema é projetado para gerenciar diferentes tipos de mídias de forma eficiente e extensível. A aplicação é capaz de identificar formatos de mídia válidos e realizar operações de reprodução e pausa, proporcionando uma interface simples e funcional para o usuário.

## Configuração e Execução
### 1. Gradle Build:

Para compilar e construir o projeto utilizando o Gradle, siga os passos abaixo:

Abra o terminal no diretório raiz do projeto.
Execute o comando de build do Gradle:
```bash
./gradlew build
```
Isso irá compilar o código-fonte e criar as distribuições no diretório build/distributions.
### 2. Executando o Programa:

Para rodar o programa e reproduzir um arquivo de mídia, utilize o seguinte comando, substituindo caminho-do-arquivo pelo caminho real do arquivo de mídia:

Descompacte a distribuição: No diretório build/distributions, você encontrará um arquivo `.zip` com o nome do seu projeto. Extraia este arquivo.
Navegue até o diretório extraído usando o terminal.
Execute o programa:
```bash
./bin/stream --caminho-do-arquivo
```



## Polimorfismo:

Utilizado na classe Player para lidar de forma uniforme com diferentes tipos de mídias (áudio e vídeo). O método play() permite a reprodução de qualquer objeto que implemente a interface Streamable, sem precisar conhecer o tipo específico do objeto.
## Classes:

Classes como Song, Video, e Loader são utilizadas para definir e gerenciar diferentes tipos de mídia. Cada classe encapsula dados e métodos específicos para suas funcionalidades, como carregar e reproduzir arquivos de áudio ou vídeo.
## Herança:

A classe Song herda da classe Streamable, aproveitando e estendendo suas funcionalidades para manipular arquivos de áudio. A herança permite reutilizar código da classe base e adicionar funcionalidades específicas para a classe derivada.
## Tratamento de Exceções:

A classe Loader utiliza o tratamento de exceções para gerenciar erros relacionados a formatos de arquivos inválidos. A classe Song também lida com exceções ao carregar e processar arquivos de áudio, garantindo que a aplicação possa tratar erros de forma controlada.
## Arquivos:

A classe Song realiza a leitura de arquivos de áudio, lidando com formatos específicos e configurando o Clip para reprodução. O gerenciamento de arquivos é fundamental para a funcionalidade de reprodução de mídia.
## Interfaces:

A interface FormatInterface é implementada pela classe AudioFormat, definindo um contrato para a validação de formatos de mídia. Isso permite que a classe AudioFormat e outras classes compartilhem uma interface comum para operações relacionadas a formatos.

## HashSet:

Utilizado na classe AudioFormat para armazenar e gerenciar formatos de mídia válidos. O HashSet oferece uma maneira eficiente de verificar a presença de formatos específicos e garantir que apenas formatos suportados sejam aceitos.
