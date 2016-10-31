Mule ESB -  Publishing and Consuming REST services using RAML

Foram implementados 3 conjuntos de API's para os serviços abaixo:

1 – Utilizando a API Movie DB API , buscar release date, title, language e poster dos 10 filmes mais populares: https://www.themoviedb.org/documentation/api

2 – Utilizando Last.FM API (http://www.last.fm/api/), trazer os detalhes do artista e quando o parâmetro “track” for enviado, trazer os detalhes de cada track. A API deve possuir dois parâmetros “artist” e “track”. O segundo é opcional.

3 -  Através das informações fornecidas pela seguinte API: https://olympic2016.herokuapp.com/api/medal_by_country , retornar:
     - 5 países com maior número de medalhas de ouro
     - 5 países com maior número de medalhas de prata
     - 5 países com maior número de medalhas de bronze
     - 10 países com maior número de medalhas no total.
     
     
Para executar o teste:

Pré-Requisito: Deve-se possuir o Anypoint Studio v6.1.2 ou superior instalado.
1- Importar o projeto contido neste repositório no Anypoint Studio;
2- Executar projeto como 'Mule Application';
3- Acessar a página do console em http://localhost:8083/accenture/console/

Os serviços implementados estão descritos na especificação RAML (accenture_test.raml) localizado em src/main/api/






