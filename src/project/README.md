# Projeto: Álbum de Figurinhas da Copa do Mundo

Este projeto é um sistema de gerenciamento para um álbum de figurinhas da Copa do Mundo, desenvolvido em Java como parte de um trabalho prático acadêmico.

## 1. Descrição

O sistema simula o gerenciamento de um álbum de figurinhas, permitindo ao usuário realizar operações como carregar um álbum, registrar novas figurinhas, listar as que faltam e as repetidas, e comparar dois álbuns para encontrar oportunidades de troca.

A lógica principal é implementada na classe `AlbumCopaMain.java` e a estrutura de dados principal é uma matriz bidimensional que representa as seleções e as figurinhas.

## 2. Funcionalidades

O programa oferece um menu de texto com as seguintes opções:

1.  **Carregar álbum**: Carrega os dados de um álbum a partir de um arquivo de texto (`album.txt`).
2.  **Registrar nova figurinha**: Adiciona uma nova figurinha ao álbum, atualizando seu status para colada ou repetida.
3.  **Listar figurinhas faltantes**: Exibe todas as figurinhas que o colecionador ainda não possui.
4.  **Listar figurinhas repetidas**: Mostra todas as figurinhas que o colecionador possui em duplicidade.
5.  **Comparar dois álbuns**: Identifica e sugere trocas possíveis entre o álbum do usuário e o de um segundo colecionador.
6.  **Sair**: Encerra o programa.

## 3. Estrutura do Projeto

*   `AlbumCopaMain.java`: Arquivo principal com a lógica do programa.
*   `script.md`: Documento original com a especificação do trabalho.
*   `album.txt` (exemplo): Arquivo de entrada que define as dimensões, seleções e o estado inicial de um álbum.
*   `/docs`: Pasta contendo a documentação do projeto.
    *   `regras_de_negocio.md`: Detalhamento das regras de negócio.
    *   `fluxo_sistema.md`: Diagrama de fluxo da aplicação.

## 4. Como Executar

1.  **Compilar o código:**
    ```bash
    javac AlbumCopaMain.java
    ```
2.  **Executar o programa:**
    ```bash
    java AlbumCopaMain
    ```
3.  Siga as instruções apresentadas no menu para interagir com o sistema. Certifique-se de que um arquivo `album.txt` com o formato correto esteja disponível no diretório.

## 5. Formato do Arquivo de Entrada (`album.txt`)

O arquivo de entrada deve seguir o seguinte formato:

*   **1ª linha:** Dois números inteiros separados por espaço: a quantidade de seleções (`M`) e a quantidade de figurinhas por seleção (`N`).
*   **M linhas seguintes:** O nome de cada seleção.
*   **M linhas finais:** Cada linha contém `N` valores inteiros separados por espaço, representando o estado de cada figurinha (0 para faltante, 1 para colada, >1 para repetida).
