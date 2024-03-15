# psychic-octo-goggles
Exercicio do Guilherme em Sala de aula

## Enunciado 😆
Uma empresa de transporte rodoviário coletivo possui n ônibus para atender m passageiros que viajam de Campinas para São Paulo.
Os passageiros esperam pelo ônibus em uma fila. É possível embarcar em uma ônibus que parte em x minutos se você chegar em y minutos, tal que y <= x
e o ônibus não esteja lotado. Os passageiros embarcam no ônibus por ordem de chegada.

## Hora de sofrer 😍

Escreva uma programa que receba como parâmetro de entrada um arrajno de inteiros buses - em que cada elemento de **buses** repsenta o horário de partida do i-ésimo ônibus
Um arranjo de interiro **passengers** represeta o horário de chegada do k-ésimo passageiro - e um número inteiro **capacity** - que representa a lotação máxima de passageiros para cada ônibus - e devolva o último horário que você pode chegar para pegar um ônibus. Você não pode chegar no mesmo horário que outro passageiro.

## Exemplos 🚀

```java
int[] buses = {10,20}
int[] passengers = {2,17,18,19}
int capacity = 2

// output = 16
```

```java
int[] buses = {20,30,10}
int[] passengers = {19,13,26,4,25,11,21}
int capacity = 2

// output = 20
```
