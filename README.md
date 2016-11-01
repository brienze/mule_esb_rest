# **Mule AnyPoint Studio-  Publishing and Consuming REST services with RAML**

Foram implementados 3 conjuntos de API's para os serviços abaixo:

1 – Utilizando a API Movie DB API , buscar release date, title, language e poster dos 10 filmes mais populares: https://www.themoviedb.org/documentation/api

2 – Utilizando Last.FM API (http://www.last.fm/api/), trazer os detalhes do artista e quando o parâmetro “track” for enviado, trazer os detalhes de cada track. A API deve possuir dois parâmetros “artist” e “track”. O segundo é opcional.

3 -  Através das informações fornecidas pela seguinte API: https://olympic2016.herokuapp.com/api/medal_by_country , retornar:

      * 5 países com maior número de medalhas de ouro
      * 5 países com maior número de medalhas de prata
      * 5 países com maior número de medalhas de bronze
      * 10 países com maior número de medalhas no total.
     

## **Instalação**

**Pré-Requisito: Deve-se possuir o Anypoint Studio v6.1.2 ou superior instalado.**

     * Importar o projeto contido neste repositório no Anypoint Studio;
     * Executar projeto como 'Mule Application';
     * Acessar a página do console em http://localhost:8083/accenture/console/

Os serviços implementados estão descritos na especificação RAML (accenture_test.raml). [Ver aqui: accenture_test.raml](/src/main/api/accenture_test.raml) para mais detalhes.

Obs:

     * Por questão de simplicidade os serviços foram especificados em apenas um arquivo RAML;
     * O fluxo contém Logs para efeito de depuração, preferi mantêm-los para demonstrar uso dos mesmos;
     * Algumas propriedades foram mantidas em arquivo, tais como o 'numero de paises que possuem o maior numero de medalhas',                              
       por exemplo. Ver arquivo mule.properties;
     * Procurei utilizar o numero mínimo possível de programação em java para a solução.
     * As api's key para acesso aos sites MovieDB e LastFm foram mantidas 'hardcoded' na configuração do connector HTTP           
       Request. O ideal seria manter em arquivo de configuração ou parametrizado em Banco Dados. Deixei desta forma por      
       questão de simplicidade.


## **Exemplos de execução**

     - curl -i -H 'content-type: application/json' localhost:8083/accenture/Movies
     - curl -i -H 'content-type: application/json' localhost:8083/accenture/Artist?artist=acdc&track=Highway+to+Hell
     - curl -i -H 'content-type: application/json' localhost:8083/accenture/Artist?artist=acdc
     - curl -i -H 'content-type: application/json' localhost:8083/accenture/GoldMaximum
     - curl -i -H 'content-type: application/json' localhost:8083/accenture/SilverMaximum
     - curl -i -H 'content-type: application/json' localhost:8083/accenture/BronzeMaximum
     - curl -i -H 'content-type: application/json' localhost:8083/accenture/MedalMaximum

**Request/Response**

     http://localhost:8083/accenture/GoldMaximum
     
- Response:
```json
[
  {
    "country": "United States",
    "medals": 46
  },
  {
    "country": "Great Britain",
    "medals": 27
  },
  {
    "country": "China",
    "medals": 26
  },
  {
    "country": "Russian Federation",
    "medals": 19
  },
  {
    "country": "Germany",
    "medals": 17
  }
]
```
     http://localhost:8083/accenture/BronzeMaximum

     
- Reponse:
```json
[
  {
    "country": "United States",
    "medals": 38
  },
  {
    "country": "China",
    "medals": 26
  },
  {
    "country": "Japan",
    "medals": 21
  },
  {
    "country": "Russian Federation",
    "medals": 19
  },
  {
    "country": "Great Britain",
    "medals": 17
  }
]
```
     http://localhost:8083/accenture/SilverMaximum
     
- Response:
```json
[
  {
    "country": "United States",
    "medals": 37
  },
  {
    "country": "Great Britain",
    "medals": 23
  },
  {
    "country": "China",
    "medals": 18
  },
  {
    "country": "Russian Federation",
    "medals": 18
  },
  {
    "country": "France",
    "medals": 18
  }
]
```
     http://localhost:8083/accenture/MedalMaximum
     
- Response:
```json
[
  {
    "country": "United States",
    "medals": 121
  },
  {
    "country": "China",
    "medals": 70
  },
  {
    "country": "Great Britain",
    "medals": 67
  },
  {
    "country": "Russian Federation",
    "medals": 56
  },
  {
    "country": "Germany",
    "medals": 42
  },
  {
    "country": "France",
    "medals": 42
  },
  {
    "country": "Japan",
    "medals": 41
  },
  {
    "country": "Australia",
    "medals": 29
  },
  {
    "country": "Italy",
    "medals": 28
  },
  {
    "country": "Canada",
    "medals": 22
  }
]
```
     http://localhost:8083/accenture/Movies
     
- Response:
```json
[
  {
    "title": "Jack Reacher: Never Go Back",
    "release_date": "2016-10-19",
    "language": "en",
    "poster": "/IfB9hy4JH1eH6HEfIgIGORXi5h.jpg"
  },
  {
    "title": "Star Trek Beyond",
    "release_date": "2016-07-07",
    "language": "en",
    "poster": "/mLrQMqyZgLeP8FrT5LCobKAiqmK.jpg"
  },
  {
    "title": "Finding Dory",
    "release_date": "2016-06-16",
    "language": "en",
    "poster": "/z09QAf8WbZncbitewNk6lKYMZsh.jpg"
  },
  {
    "title": "Inferno",
    "release_date": "2016-10-13",
    "language": "en",
    "poster": "/oFOG2yIRcluKfTtYbzz71Vj9bgz.jpg"
  },
  {
    "title": "Doctor Strange",
    "release_date": "2016-10-25",
    "language": "en",
    "poster": "/cPaQPtbJkJzuDQ6BxyH9Dg4Fw8r.jpg"
  },
  {
    "title": "Nerve",
    "release_date": "2016-07-27",
    "language": "en",
    "poster": "/uM1dNEmcAeyDGjMcFLlkKOyBgft.jpg"
  },
  {
    "title": "Captain America: Civil War",
    "release_date": "2016-04-27",
    "language": "en",
    "poster": "/5N20rQURev5CNDcMjHVUZhpoCNC.jpg"
  },
  {
    "title": "Mad Max: Fury Road",
    "release_date": "2015-05-13",
    "language": "en",
    "poster": "/kqjL17yufvn9OVLyXYpvtyrFfak.jpg"
  },
  {
    "title": "Sausage Party",
    "release_date": "2016-07-11",
    "language": "en",
    "poster": "/jDeDRLEa8JqB3xmKVy6q3bkmDt6.jpg"
  },
  {
    "title": "Jurassic World",
    "release_date": "2015-06-09",
    "language": "en",
    "poster": "/jjBgi2r5cRt36xF6iNUEhzscEcb.jpg"
  }
]
 ```
 
     http://localhost:8083/accenture/Artist?artist=acdc&track=Highway+to+Hell
     
- Response:
```json
{
  "Artist": [
    {
      "name": "ACDC",
      "url": "https://www.last.fm/music/+noredirect/ACDC",
      "tags": [
        {
          "name": "hard rock",
          "url": "https://www.last.fm/tag/hard+rock"
        },
        {
          "name": "classic rock",
          "url": "https://www.last.fm/tag/classic+rock"
        },
        {
          "name": "Rock and Roll",
          "url": "https://www.last.fm/tag/Rock+and+Roll"
        },
        {
          "name": "heavy metal",
          "url": "https://www.last.fm/tag/heavy+metal"
        },
        {
          "name": "rock",
          "url": "https://www.last.fm/tag/rock"
        }
      ],
      "similar": [
        {
          "name": "hard rock",
          "url": "https://www.last.fm/tag/hard+rock"
        },
        {
          "name": "classic rock",
          "url": "https://www.last.fm/tag/classic+rock"
        },
        {
          "name": "Rock and Roll",
          "url": "https://www.last.fm/tag/Rock+and+Roll"
        },
        {
          "name": "heavy metal",
          "url": "https://www.last.fm/tag/heavy+metal"
        },
        {
          "name": "rock",
          "url": "https://www.last.fm/tag/rock"
        }
      ],
      "image": {
        "#text": "https://lastfm-img2.akamaized.net/i/u/34s/7c8e775c68a94c239e8056290a3eb3d3.png",
        "size": "small"
      },
      "bio": {
        "links": {
          "link": {
            "#text": "",
            "rel": "original",
            "href": "https://last.fm/music/+noredirect/ACDC/+wiki"
          }
        },
        "published": "02 Mar 2009, 03:45",
        "summary": "AC/DC is an Australian rock band formed in Sydney in 1973 by Malcolm and Angus Young. They play hard rock, but they were considered pioneers of heavy metal, according to themselves they play \"rock and roll\".\n\nAC/DC has sold over 200 million albums world wide. They're #4 on VH1's \"100 Greatest Artists of Hard Rock\" and ranked #7 on MTV's \"Greatest Heavy Metal Band Of All Time\".\n\nIn the beginning the lead singer was Bon Scott, who had a very distinct voice. 
<a href=\"https://www.last.fm/music/+noredirect/ACDC\">Read more on Last.fm</a>",
        "content": "AC/DC is an Australian rock band formed in Sydney in 1973 by Malcolm and Angus Young. They play hard rock, but they were considered pioneers of heavy metal, according to themselves they play \"rock and roll\".\n\nAC/DC has sold over 200 million albums world wide. They're #4 on VH1's \"100 Greatest Artists of Hard Rock\" and ranked #7 on MTV's \"Greatest Heavy Metal Band Of All Time\".\n\nIn the beginning the lead singer was Bon Scott, who had a very distinct voice. When he died in 1980, Brian Johnson took over the lead vocals. Brian Johnson debuted with what is probably now their most known album, \"Back in Black\", in part written by Bon Scott.\n\nRead more on Wikipedia:http://en.wikipedia.org/wiki/AC/DC 
<a href=\"https://www.last.fm/music/+noredirect/ACDC\">Read more on Last.fm</a>. User-contributed text is available under the Creative Commons By-SA License; additional terms may apply."
      },
      "track": {
        "name": "Highway to Hell",
        "mbid": "5935ec91-8124-42ff-937f-f31a20ffe58f",
        "url": "https://www.last.fm/music/AC%2FDC/_/Highway+to+Hell",
        "duration": "206000",
        "streamable": {
          "#text": "0",
          "fulltrack": "0"
        },
        "listeners": "888907",
        "playcount": "6623380",
        "artist": {
          "name": "AC/DC",
          "mbid": "66c662b6-6e2f-4930-8610-912e24c63ed1",
          "url": "https://www.last.fm/music/AC%2FDC"
        },
        "album": {
          "artist": "AC/DC",
          "title": "Highway to Hell",
          "mbid": "01caa837-59b9-487a-bc3f-a47f6cf7e345",
          "url": "https://www.last.fm/music/AC%2FDC/Highway+to+Hell",
          "image": [
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/34s/77b0b45bd10146febec7262bc8967dfb.png",
              "size": "small"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/64s/77b0b45bd10146febec7262bc8967dfb.png",
              "size": "medium"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/174s/77b0b45bd10146febec7262bc8967dfb.png",
              "size": "large"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/300x300/77b0b45bd10146febec7262bc8967dfb.png",
              "size": "extralarge"
            }
          ],
          "@attr": {
            "position": "1"
          }
        },
        "toptags": {
          "tag": [
            {
              "name": "hard rock",
              "url": "https://www.last.fm/tag/hard+rock"
            },
            {
              "name": "rock",
              "url": "https://www.last.fm/tag/rock"
            },
            {
              "name": "classic rock",
              "url": "https://www.last.fm/tag/classic+rock"
            },
            {
              "name": "ACDC",
              "url": "https://www.last.fm/tag/ACDC"
            },
            {
              "name": "heavy metal",
              "url": "https://www.last.fm/tag/heavy+metal"
            }
          ]
        },
        "wiki": {
          "published": "02 Dec 2008, 10:52",
          "summary": "\"Highway to Hell\" is a song by the hard rock band AC/DC. It is the opening track of the group's 1979 album Highway to Hell and the twelfth track on AC/DC Live.\n\nThe song was written by Bon Scott, Angus Young and Malcolm Young while the main guitar riff was created by Malcolm Young. The track has become one of the most famous songs in rock history. AC/DC had made several studio albums before and was constantly supporting them by going on a grueling tour schedule. 
<a href=\"http://www.last.fm/music/AC%2FDC/_/Highway+to+Hell\">Read more on Last.fm</a>.",
          "content": "\"Highway to Hell\" is a song by the hard rock band AC/DC. It is the opening track of the group's 1979 album Highway to Hell and the twelfth track on AC/DC Live.\n\nThe song was written by Bon Scott, Angus Young and Malcolm Young while the main guitar riff was created by Malcolm Young. The track has become one of the most famous songs in rock history. AC/DC had made several studio albums before and was constantly supporting them by going on a grueling tour schedule.\n\nThe song and album's title supposedly came after a reporter asked bandmembers if they could describe what life was like being constantly on tour. Angus replied that it was \"a fucking highway to Hell\"[citation needed], and the name stuck. He stated in the magazine \"Guitar World\" that when you are out on the road on a bus sleeping with a guy's smelly sock in your face, it's like you're on the highway to hell. Rumours persisted that the band members were satanists, and this comment, and the album cover depicting Angus with devil horns and tail only added fuel to the fire. (The band has denied having anything to do with Satanism, Malcolm having even commented that \"me mum would kill me for that!\") Nevertheless, this and other songs brought AC/DC its first million-copy-selling album, and sent Highway to Hell to #17 on the charts. Scott would be found dead in the back of a friend's car just over six months later. The success of the Highway to Hell song and album set AC/DC on track to record its most famous album and tribute to Bon, Back In Black, one year later. The song \"Highway to Hell\" is part of the The Rock and Roll Hall of Fame's 500 Songs that Shaped Rock and Roll list.[1] The single was certified Gold by the RIAA for sales in excess of 500,000. 
<a href=\"http://www.last.fm/music/AC%2FDC/_/Highway+to+Hell\">Read more on Last.fm</a>. User-contributed text is available under the Creative Commons By-SA License; additional terms may apply."
        }
      }
    }
  ]
}
```

     http://localhost:8083/accenture/Artist?artist=rush
     
- Response:
```json
{
  "artist": {
    "name": "Rush",
    "mbid": "eb62559f-2fb2-4879-af18-a23ea2ee91b1",
    "url": "https://www.last.fm/music/Rush",
    "image": [
      {
        "#text": "https://lastfm-img2.akamaized.net/i/u/34s/55e04feb232c4e83bad34138b6c916ca.png",
        "size": "small"
      },
      {
        "#text": "https://lastfm-img2.akamaized.net/i/u/64s/55e04feb232c4e83bad34138b6c916ca.png",
        "size": "medium"
      },
      {
        "#text": "https://lastfm-img2.akamaized.net/i/u/174s/55e04feb232c4e83bad34138b6c916ca.png",
        "size": "large"
      },
      {
        "#text": "https://lastfm-img2.akamaized.net/i/u/300x300/55e04feb232c4e83bad34138b6c916ca.png",
        "size": "extralarge"
      },
      {
        "#text": "https://lastfm-img2.akamaized.net/i/u/55e04feb232c4e83bad34138b6c916ca.png",
        "size": "mega"
      },
      {
        "#text": "https://lastfm-img2.akamaized.net/i/u/arQ/55e04feb232c4e83bad34138b6c916ca.png",
        "size": ""
      }
    ],
    "streamable": "0",
    "ontour": "0",
    "stats": {
      "listeners": "1025207",
      "playcount": "45200293"
    },
    "similar": {
      "artist": [
        {
          "name": "Geddy Lee",
          "url": "https://www.last.fm/music/Geddy+Lee",
          "image": [
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/34s/bb752b3955014797802c853afc12503b.png",
              "size": "small"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/64s/bb752b3955014797802c853afc12503b.png",
              "size": "medium"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/174s/bb752b3955014797802c853afc12503b.png",
              "size": "large"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/300x300/bb752b3955014797802c853afc12503b.png",
              "size": "extralarge"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/bb752b3955014797802c853afc12503b.png",
              "size": "mega"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/arQ/bb752b3955014797802c853afc12503b.png",
              "size": ""
            }
          ]
        },
        {
          "name": "Yes",
          "url": "https://www.last.fm/music/Yes",
          "image": [
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/34s/0dc33499c7e140a19c45befb91579d35.png",
              "size": "small"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/64s/0dc33499c7e140a19c45befb91579d35.png",
              "size": "medium"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/174s/0dc33499c7e140a19c45befb91579d35.png",
              "size": "large"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/300x300/0dc33499c7e140a19c45befb91579d35.png",
              "size": "extralarge"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/0dc33499c7e140a19c45befb91579d35.png",
              "size": "mega"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/arQ/0dc33499c7e140a19c45befb91579d35.png",
              "size": ""
            }
          ]
        },
        {
          "name": "Genesis",
          "url": "https://www.last.fm/music/Genesis",
          "image": [
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/34s/8c800f235a5b4903953bc2fb6f83a74f.png",
              "size": "small"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/64s/8c800f235a5b4903953bc2fb6f83a74f.png",
              "size": "medium"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/174s/8c800f235a5b4903953bc2fb6f83a74f.png",
              "size": "large"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/300x300/8c800f235a5b4903953bc2fb6f83a74f.png",
              "size": "extralarge"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/8c800f235a5b4903953bc2fb6f83a74f.png",
              "size": "mega"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/arQ/8c800f235a5b4903953bc2fb6f83a74f.png",
              "size": ""
            }
          ]
        },
        {
          "name": "Emerson, Lake & Palmer",
          "url": "https://www.last.fm/music/Emerson,+Lake+&+Palmer",
          "image": [
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/34s/43695b433fdf40a193353c229dec20c6.png",
              "size": "small"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/64s/43695b433fdf40a193353c229dec20c6.png",
              "size": "medium"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/174s/43695b433fdf40a193353c229dec20c6.png",
              "size": "large"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/300x300/43695b433fdf40a193353c229dec20c6.png",
              "size": "extralarge"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/43695b433fdf40a193353c229dec20c6.png",
              "size": "mega"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/arQ/43695b433fdf40a193353c229dec20c6.png",
              "size": ""
            }
          ]
        },
        {
          "name": "Dream Theater",
          "url": "https://www.last.fm/music/Dream+Theater",
          "image": [
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/34s/943478f7df924e9399aba70b7410de60.png",
              "size": "small"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/64s/943478f7df924e9399aba70b7410de60.png",
              "size": "medium"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/174s/943478f7df924e9399aba70b7410de60.png",
              "size": "large"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/300x300/943478f7df924e9399aba70b7410de60.png",
              "size": "extralarge"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/943478f7df924e9399aba70b7410de60.png",
              "size": "mega"
            },
            {
              "#text": "https://lastfm-img2.akamaized.net/i/u/arQ/943478f7df924e9399aba70b7410de60.png",
              "size": ""
            }
          ]
        }
      ]
    },
    "tags": {
      "tag": [
        {
          "name": "Progressive rock",
          "url": "https://www.last.fm/tag/Progressive+rock"
        },
        {
          "name": "classic rock",
          "url": "https://www.last.fm/tag/classic+rock"
        },
        {
          "name": "hard rock",
          "url": "https://www.last.fm/tag/hard+rock"
        },
        {
          "name": "rock",
          "url": "https://www.last.fm/tag/rock"
        },
        {
          "name": "Progressive",
          "url": "https://www.last.fm/tag/Progressive"
        }
      ]
    },
    "bio": {
      "links": {
        "link": {
          "#text": "",
          "rel": "original",
          "href": "https://last.fm/music/Rush/+wiki"
        }
      },
      "published": "15 Feb 2006, 07:03",
      "summary": "Rush is a progressive rock band which formed in Willowdale, Ontario, Canada in 1968. The band currently performs with the lineup of Geddy Lee (vocals, bass, keyboards), Alex Lifeson (guitar) and Neil Peart (drums). John Rutsey was the original drummer, later replaced by Neil Peart in 1974, shortly after the release of their first album, and three weeks before their first American tour. Neil Peart also became the band’s lyricist, and wrote the words for many of the band’s best known songs. 
<a href=\"https://www.last.fm/music/Rush\">Read more on Last.fm</a>",
      "content": "Rush is a progressive rock band which formed in Willowdale, Ontario, Canada in 1968. The band currently performs with the lineup of Geddy Lee (vocals, bass, keyboards), Alex Lifeson (guitar) and Neil Peart (drums). John Rutsey was the original drummer, later replaced by Neil Peart in 1974, shortly after the release of their first album, and three weeks before their first American tour. Neil Peart also became the band’s lyricist, and wrote the words for many of the band’s best known songs. As a group, Rush possesses 24 gold records and 14 platinum (3 multi-platinum) records. According to the RIAA, Rush’s sales statistics place them third behind The Beatles and The Rolling Stones for the most consecutive gold or platinum albums by a rock band. \n\nRush also ranks 78th in U.S. album sales with 25 million units. Although total worldwide album sales are not calculated by any single entity, as of 2004 several industry sources estimated Rush's total worldwide album sales at over 40 million units. The band were inducted into the Rock and Roll Hall of Fame in 2013.\n\nStarting out as a bar band in 1968 in Willowdale, Toronto, Ontario, Canada, Geddy Lee, Alex Lifeson and then drummer John Rutsey were perhaps the hardest working unsigned act of the day. Refusing to conform and play top 40 material, they were determined to play what they wanted to play, and on their own terms.\n\nIn 1974, after the release of their self-titled debut, Neil Peart took over for John Rutsey and soon proved to be not only an amazing drummer, but also an excellent lyricist. His often epic compositions fit perfectly with the band's playing.\n\nFrom their metal-edged, more classic rock type material of the early- to mid-70s, Rush were on their way to the top. It wasn't until their late-70's/early-80s material that the band broke through. Rush's 80's output was unlike anything else anyone had produced back then, but still managed to do well.  In the 90's, Rush very suddenly changed styles with the release of Counterparts, focusing on a more modern type of rock that was becoming popular right around that time. Most of the albums became similar to hard rock, and arena rock. However, Rush never lost their signature sound, setting them apart from all other bands.\n \nWhile they have not had many radio hits, few hard rock fans have not heard of the band's bigger hits like \"Working Man\", \"The Spirit of Radio\", \"Limelight\" and of course the enigmatic \"Tom Sawyer\", which catapulted the band into the limelight in 1981.\n\nNow in their fourth decade of making music together, the hard working men of Rush still continue to wow their audience, and even bring aboard some new fans. In 2005, the band released another DVD concert, filmed in Frankfurt, Germany on their 2004 30th Anniversary tour; Rush still shows no signs of stopping. \n\nRush's last-but-one album was released on May 1st, 2007, Snakes & Arrows. Its first single was \"Far Cry\". The single aired on radios and released on the internet on March 12th. The trio began touring to support the album on an international schedule on June 13, 2007.\n\nRush released two new songs (\"Caravan\" and \"BU2B\") on June 1, 2010. In the digital booklet provided on iTunes, they are said to be parts One and Two of \"Clockwork Angels\", a work in progress.\n\nIn 2012 Rush finally released album \"Clockwork Angels\" and on 7th of September started 1st part of their Clockwork Angels Tour (official dates : September 7 - December 2 2012; May 22, 2013 - June 10, 2013). 
<a href=\"https://www.last.fm/music/Rush\">Read more on Last.fm</a>. User-contributed text is available under the Creative Commons By-SA License; additional terms may apply."
    }
  }
}
```



