# **Mule ESB -  Publishing and Consuming REST services using RAML**

Foram implementados 3 conjuntos de API's para os serviços abaixo:

1 – Utilizando a API Movie DB API , buscar release date, title, language e poster dos 10 filmes mais populares: https://www.themoviedb.org/documentation/api

2 – Utilizando Last.FM API (http://www.last.fm/api/), trazer os detalhes do artista e quando o parâmetro “track” for enviado, trazer os detalhes de cada track. A API deve possuir dois parâmetros “artist” e “track”. O segundo é opcional.

3 -  Através das informações fornecidas pela seguinte API: https://olympic2016.herokuapp.com/api/medal_by_country , retornar:

      * 5 países com maior número de medalhas de ouro
      * 5 países com maior número de medalhas de prata
      * 5 países com maior número de medalhas de bronze
      * 10 países com maior número de medalhas no total.
     

**Instalação**

**Pré-Requisito: Deve-se possuir o Anypoint Studio v6.1.2 ou superior instalado.**

     * Importar o projeto contido neste repositório no Anypoint Studio;
     * Executar projeto como 'Mule Application';
     * Acessar a página do console em http://localhost:8083/accenture/console/

Os serviços implementados estão descritos na especificação RAML (_accenture_test.raml_) localizado em _src/main/api/

Obs:

     * Por questão de simplicidade os serviços foram especificados em apenas um arquivo RAML;
     * O fluxo contém Logs para efeito de depuração, preferi mantêm-los para demonstrar uso dos mesmos;
     * Algumas propriedades foram mantidas em arquivo, tais como o 'numero de paises que possuem o maior numero de medalhas',                              
       por exemplo. Ver arquivo mule.properties;
     * Procurei utilizar o numero mínimo possível de programação em java para a solução.






