# API LocalTime

## Código:
````
public LocalTime calcularDuracao(){
  LocalTime soma = LocalTime.of(0,0,0); // Cria um LocalTime com 0 horas, 0 minutos e 0 segundos
  for (Musica m: musicas) { // Percorre cada música na lista "musicas"
    soma = soma.plusHours(m.getDuracao().getHour()) // Adiciona as horas da música à variável "soma"
              .plusMinutes(m.getDuracao().getMinute()) // Adiciona os minutos da música à variável "soma"
              .plusSeconds(m.getDuracao().getSecond()); // Adiciona os segundos da música à variável "soma"
  }
  return soma; // Retorna a variável "soma" com a duração total
}

````
## Explicação do código
O método calcularDuracao() percorre uma lista de músicas e calcula a duração total da playlist. Para isso, ele cria um objeto LocalTime com 0 horas, 
0 minutos e 0 segundos. Em seguida, para cada música na lista, ele adiciona as horas, 
minutos e segundos da música à variável soma. Finalmente, o método retorna a variável soma com a duração total da playlist.

## LocalTime na API Java Time
A classe LocalTime da API java.time representa um instante no tempo do dia, sem considerar a data. É como se fosse a hora que você vê no seu relógio de parede, com horas, minutos e (opcionalmente) segundos.

Aqui estão alguns pontos-chave sobre o LocalTime:

* Imutável: Uma vez criado, um objeto LocalTime não pode ser alterado.
* Preciso: Representa o tempo com precisão de nanossegundos (embora raramente usado na prática).
* Sem fuso horário: Diferente de LocalDateTime, LocalTime não considera o fuso horário. Serve apenas para representar a hora do dia.

* Criando um objeto LocalTime:
Você pode criar um objeto LocalTime usando o método of():

````
LocalTime agora = LocalTime.of(10, 20, 30);  // Cria um LocalTime com 10:20:30

````
Acessando Valores:
Para acessar os valores de hora, minuto e segundo separadamente, use métodos como:
````
int hora = agora.getHour();
int minuto = agora.getMinute();
int segundo = agora.getSecond();

````
* Manipulando o Tempo:
Você pode adicionar ou subtrair horas, minutos e segundos usando métodos como:
````
LocalTime maisUmaHora = agora.plusHours(1);  // Adiciona 1 hora
LocalTime menosDezMinutos = agora.minusMinutes(10);  // Subtrai 10 minutos

````
* Comparando LocalTime:
Você pode comparar dois objetos LocalTime para ver qual é anterior ou posterior:

````
if (agora.isBefore(maisUmaHora)) {
  System.out.println("Agora é antes de maisUmaHora");
}

````
* Formatação:
Você pode formatar o LocalTime para uma string legível usando o método toString():
````
String horaFormatada = agora.toString();  // Exemplo: "10:20:30"
````
## Diferença de LocalDateTime:
Enquanto LocalTime representa apenas a hora do dia, LocalDateTime representa data e hora combinadas, 
sem fuso horário. Se você precisa trabalhar com datas e horas completas, use LocalDateTime.
