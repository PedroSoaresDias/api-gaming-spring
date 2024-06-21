# API de Jogos e Consoles

A ideia de fazer esse projeto, foi um desafio da DIO de criar uma API RESTFul utilizando o Java com o Spring e fazer o deploy no Railway.

## Tecnologias utilizadas

- Java 21: Foi a linguagem principal para o desenvolvimento da API RESTFul.

- Spring Boot: Framework Java para agilizar o processo de desenvolvimento da API RESTFul.

- PostgreSQL: Banco de Dados Relacional onde está armazenados os arquivos.

- Railway: Onde foi feito o deploy da aplicação e do banco de dados.

## Como é a estrutura da API das requisições

Mostrando as rotas da API para fazer as requisições (Tudo sendo executado no localhost).

### Rota da API de Games

#### Obter os dados de todos os jogos

```bash
GET http://localhost:8080/games

[
    {
        "id": 1,
        "nome": "Forza Horizon",
        "editor": "Xbox Game Studio",
        "desenvolvedores": [
            {
                "id": 1,
                "nome": "Playground Games"
            },
            {
                "id": 2,
                "nome": "Turn 10 Studios"
            }
        ],
        "genero": [
            {
                "id": 1,
                "nome": "Corrida"
            }
        ],
        "plataformas": [
            {
                "id": 1,
                "nome": "Xbox 360"
            }
        ]
    },
    {
        "id": 2,
        "nome": "Forza Horizon 2",
        "editor": "Xbox Game Studio",
        "desenvolvedores": [
            {
                "id": 3,
                "nome": "Playground Games"
            },
            {
                "id": 4,
                "nome": "Turn 10 Studios"
            },
            {
                "id": 5,
                "nome": "Sumo Digital"
            }
        ],
        "genero": [
            {
                "id": 2,
                "nome": "Corrida"
            }
        ],
        "plataformas": [
            {
                "id": 2,
                "nome": "Xbox 360"
            },
            {
                "id": 3,
                "nome": "Xbox One"
            }
        ]
    },
    {
        "id": 3,
        "nome": "God of War 4",
        "editor": "Sony Interactive Entertainment",
        "desenvolvedores": [
            {
                "id": 6,
                "nome": "Santa Monica Studio"
            },
            {
                "id": 7,
                "nome": "Jetpack Interactive"
            }
        ],
        "genero": [
            {
                "id": 3,
                "nome": "Ação e Aventura"
            },
            {
                "id": 4,
                "nome": "RPG"
            }
        ],
        "plataformas": [
            {
                "id": 4,
                "nome": "PlayStation 4"
            },
            {
                "id": 5,
                "nome": "Microsoft Windows"
            }
        ]
    }
]
```

#### Obter o dado do jogo pelo Id

```bash
GET http://localhost:8080/games/1

{
    "id": 1,
    "nome": "Forza Horizon",
    "editor": "Xbox Game Studio",
    "desenvolvedores": [
        {
            "id": 1,
            "nome": "Playground Games"
        },
        {
            "id": 2,
            "nome": "Turn 10 Studios"
        }
    ],
    "genero": [
        {
            "id": 1,
            "nome": "Corrida"
        }
    ],
    "plataformas": [
        {
            "id": 1,
            "nome": "Xbox 360"
        }
    ]
}
```

#### Inserir novos dados do jogo

```bash
POST http://localhost:8080/games
```

#### Atualizar os dados de jogos existentes pelo Id

```bash
PUT http://localhost:8080/games/{id}
```

#### Excluir os dados do jogo pelo Id

```bash
DELETE http://localhost:8080/games/{id}
```

### Rota da API de Consoles

#### Obter os dados de todos os consoles

```bash
GET http://localhost:8080/console

[
    {
        "id": 1,
        "nome": "Xbox 360",
        "anoLancamento": 2005,
        "modelos": [
            {
                "id": 1,
                "nome": "Xbox 360 Fat"
            },
            {
                "id": 2,
                "nome": "Xbox 360 Slim"
            },
            {
                "id": 3,
                "nome": "Xbox 360 Super Slim"
            }
        ]
    },
    {
        "id": 2,
        "nome": "PlayStation 3",
        "anoLancamento": 2006,
        "modelos": [
            {
                "id": 7,
                "nome": "PlayStation 3 Fat"
            },
            {
                "id": 8,
                "nome": "PlayStation 3 Slim"
            },
            {
                "id": 9,
                "nome": "PlayStation 3 Super Slim"
            }
        ]
    },
    {
        "id": 3,
        "nome": "Xbox One",
        "anoLancamento": 2013,
        "modelos": [
            {
                "id": 10,
                "nome": "Xbox One Fat"
            },
            {
                "id": 11,
                "nome": "Xbox One S"
            },
            {
                "id": 12,
                "nome": "Xbox One X"
            }
        ]
    },
    {
        "id": 4,
        "nome": "PlayStation 4",
        "anoLancamento": 2013,
        "modelos": [
            {
                "id": 16,
                "nome": "PlayStation 4 Fat"
            },
            {
                "id": 17,
                "nome": "PlayStation 4 Slim"
            },
            {
                "id": 18,
                "nome": "PlayStation 4 Pro"
            }
        ]
    }
]
```

#### Obter o dado do console pelo Id

```bash
GET http://localhost:8080/console/1
{
    "id": 1,
    "nome": "Xbox 360",
    "anoLancamento": 2005,
    "modelos": [
        {
            "id": 1,
            "nome": "Xbox 360 Fat"
        },
        {
            "id": 2,
            "nome": "Xbox 360 Slim"
        },
        {
            "id": 3,
            "nome": "Xbox 360 Super Slim"
        }
    ]
}
```


#### Inserir novos dados do console

```bash
POST http://localhost:8080/console
```

#### Atualizar os dados de consoles existentes pelo Id

```bash
PUT http://localhost:8080/console/{id}
```

#### Excluir os dados do console pelo Id

```bash
DELETE http://localhost:8080/console/{id}
```

### Observações

Ao fazer uma requisição nas rotas "games" e "console" utilizando o método PUT, os dados que foram atualizados funcionam bem, mas nos atributos onde contem os arrays de cada rota, o id do(s) desenvolvedor(es), gênero(s) e plataforma(s) na rota de games serão incrementados, mesmo se não mexer em algum dos arrays, e a mesma coisa com a rota de console, que está tendo a mesma observação.