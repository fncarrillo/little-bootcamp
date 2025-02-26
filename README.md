# Emperor Penguin Destroyer

> En nuestra primer iteración comenzaremos con el desarrollo de un videojuego por turnos de rogue-like, donde nuestro protagonista deberá enfrentarse a inumerables enemigos hasta enfrentarse al jefe final y derrotarlo o morir en el intento.

## Requerimientos

Inicialmente estaremos sentando las bases del mecanismo de pelea.
Por el momento sólo nos informaron que se el jugador puede realizar por turno 1 solo movimiento:
- Atacar: le hará 10 de daño al enemigo
- Defender: se dará un escudo de 5 puntos (es necesario entender que 1 punto de ataque reduce 1 punto de escudos)
- Curarse: se curará el 15% de su vida máxima

Los enemigos por otro lado pueden:
- Atacar: le hará 15 de daño al jugador
- Defender: se dará un escudo de 10 puntos

Cada turno durante la fase de pelea lleva el siguiente patrón:
1. El enemigo indica su intención de movimiento (deberá decirnos por pantalla si quiere atacar o defender)
2. El jugador deberá seleccionar su movimiento, el cual se efectuará
3. El enemigo ejecutará su movimiento

> [!Note]
> La defensa tiene "prioridad" sobre los ataques, por lo que si el enemigo tenía la intención de defenderse cuando el jugador buscaba atacarlo, el enemigo debería primero darse el escudo y luego recibir el ataque.

## Tips
1. Identificar las abstracciones necesarias (clases)
2. Asignar el comportamiento y estado (atributos y métodos)

> [!Note]
> NO es necesario implementar en el MAIN nada en particular, ni pensar en la posibilidad de pelear contra N enemigos, simplemente sentar las bases de las mecánicas de pelea.