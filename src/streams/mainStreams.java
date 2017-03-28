/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.groupingBy;

/**
 *
 * @author Sara
 */
public class mainStreams {

    public static void main(String[] args) {
       
        Equipo e1 = new Equipo("Los Ángeles Mankers","Barcelona", LocalDate.of(2000,12,16));
        Equipo e2 = new Equipo("Cegatos Bulls","Madrid", LocalDate.of(1899,1,1));
        Equipo e3 = new Equipo("Cojos Celtics","Barcelona", LocalDate.of(1899,2,5));
        
        List<Equipo> teams = new ArrayList<>();
        teams.add(e1);
        teams.add(e2);
        teams.add(e3);
        
        List<Jugador> players = Arrays.asList(
            new Jugador("Dixie Kong", LocalDate.of(1992, 6, 23),300,e1),
            new Jugador("Tiny Kong", LocalDate.of(1994, 9, 2),(int)(Math.random()*600),e1),    
            new Jugador("Candy Kong", LocalDate.of(1999, 11, 23),(int)(Math.random()*300)+200,e1),
            new Jugador("Kiddy Kong", LocalDate.of(2009, 5, 19),(int)(Math.random()*600),e2),
            new Jugador("Diddy Kong", LocalDate.of(2004, 2, 18),300,e2),
            new Jugador("Donkey Kong", LocalDate.of(2002, 2, 23),(int)(Math.random()*300)+200,e2),
            new Jugador("Chuny Kong", LocalDate.of(1997, 6, 19),300,e3),
            new Jugador("Swanky Kong", LocalDate.of(1994, 11, 29),(int)(Math.random()*600),e3),
            new Jugador("Cranky Kong", LocalDate.of(1987, 12, 16),(int)(Math.random()*300)+200,e3));
    
        int opc=0;
        do{
            mostrarmenu();
            opc=EDatos.pedirEntero("Escoja una opción: ");
            switch(opc){
                case 1:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Lista de jugadores con más de 500 canastas:");
                    System.out.println(mas500Canastas(players));
                    break;
                    
                case 2:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Lista de jugadores que tienen entre 200 y 500 canastas:");
                    System.out.println(entre20y500Canastas(players));
                    break;
                
                case 3:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Lista de los nombres de los jugadores que tienen entre 200 y 500 canastas:");
                    System.out.println(nombreJugadoresentre20y500Canastas(players));
                    break;
                    
                case 4:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Lista de jugadores ordenados por fecha de nacimiento:");
                    System.out.println(jugadoresOrderNacimiento(players));
                    break;
                    
                case 5:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Lista de jugadores ordenados por número de canástas:");
                    System.out.println(jugadoresOrderCanastas(players));
                    break;
                    
                case 6:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("5 jugadores con más canastas:");
                    System.out.println(jugador5MasCanastas(players));
                    break;
                    
                case 7:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Lista de jugadores que tienen entre 200 y 500 canastas ordenados por fecha de nacimiento de manera descendente:");
                    System.out.println(entre200y500OrderNacimiento(players));
                    break;
                    
                case 8:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Lista de jugadores que tienen entre 200 y 500 canastas ordenados por canastas y si coinciden en número por fecha de nacimiento:");
                    System.out.println(jugadorEntre200y500CanastasOrderNacimiento(players));
                    break;
                    
                case 9:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Jugador que ha realizado el mínimo de canastas:");
                    System.out.println(jugadorMinCanastas(players));
                    break;
                    
                case 10:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Jugador que ha realizado el máximo de canastas:");
                    System.out.println(jugadorMaxCanastas(players));
                    break;
                    
                case 11:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Media de canastas:");
                    System.out.println(avgCanastas(players));
                    break;
                    
                case 12:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Lista de jugadores que pertenezcan a equipos cuya localidad sea Barcelona:");
                    System.out.println(jugadoresEquipoInBCN(players));
                    break;
                    
                case 13:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Devolver un boolean si hay algun equipo que ha conseguido más de 4000 canastas:");
                    System.out.println(jugadorMas4000Canastas(players));
                    break;
                    
                case 14:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Devolver un boolean si todos los jugadores han conseguido más de 50 canastas:");
                    System.out.println(jugadoresMas50(players));
                    break;
                    
                case 15:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Devolver un boolean si todos los jugadores de primer equipo han conseguido más de 50 canastas:");
                    System.out.println(jugadorMas50CanastasEquipo1(players));
                    break;
                    
                case 16:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Devolver un Map agrupando los equipos que pertenecen a la misma localidad:");
                    System.out.println(equiposGroupByLocalidad(teams));
                    break;
                    
                case 17:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Devolver la suma de canastas de todos los jugadores:");
                    System.out.println(sumCanastas(players));
                    break;
                    
                case 18:
                    System.out.println("Todos los jugadores:");
                    System.out.println(players);
                    System.out.println("");
                    System.out.println("Devolver la suma de canastas agrupado por equipos:");
                    System.out.println(sumCanastasForEquipo(players));
                    break;
                    
                case 19:
                    System.out.println("El programa se ha detenido.");
                    System.exit(0);
                    break;
            }
        }while(opc!=19);
    }
    
    public static void mostrarmenu(){
        System.out.println("[**********************************[ *CONSULTAS STREAMS* ]****************************]");
        System.out.println("[* [01]- Jugadores con + de 500 canastas                                             *]");
        System.out.println("[* [02]- Jugadores entre 200 y 500 canastas                                          *]");
        System.out.println("[* [03]- Nombres de jugadores entre 200 y 500 canastas                               *]");
        System.out.println("[* [04]- Jugadores ordenados por fecha de nacimiento                                 *]");
        System.out.println("[* [05]- Jugadores ordenados por numero de canastas                                  *]");
        System.out.println("[* [06]- 5 Jugadores con más canastas                                                *]");
        System.out.println("[* [07]- Jugadores que han obtenido entre 200 y 500 por fecha                        *]");
        System.out.println("[* [08]- Jugadores que han obtenido entre 200 y 500 canastas segundo lugar           *]");
        System.out.println("[* [09]- Jugador con el mínimo numero de canastas                                    *]");
        System.out.println("[* [10]- Jugador con el máximo número de canastas                                    *]");
        System.out.println("[* [11]- Media de canastas                                                           *]");
        System.out.println("[* [12]- Jugadores que pertenezcan a equipos que su localidad es Barcelona           *]");
        System.out.println("[* [13]- boolean si hay algún jugador que ha conseguido + de 4000 canastas           *]");
        System.out.println("[* [14]- boolean si todos los jugadores han conseguido más de 50 canastas            *]");
        System.out.println("[* [15]- boolean si todos los jugadores del equipo 1 han conseguido + de 50 canastas *]");
        System.out.println("[* [16]- Map agrupando los equipos por localidad                                     *]");
        System.out.println("[* [17]- suma de canastas de los jugadores                                           *]");
        System.out.println("[* [18]- suma de las canastas de los jugadores agrupado por equipos                  *]");
        System.out.println("[* [19]- Salir                                                                       *]");
        System.out.println("[*************************************************************************************]");
    }
    
    //1
    public static List<Jugador> mas500Canastas(List<Jugador> players){
        return players.stream().filter(jugador -> jugador.getCanastas()>500).collect(Collectors.toList());
    }
    //2
    public static List<Jugador> entre20y500Canastas(List<Jugador> players){
        return players.stream().filter(jugador -> jugador.getCanastas()<=500 && jugador.getCanastas()>=200).collect(Collectors.toList());
    }
    //3
    public static List<String> nombreJugadoresentre20y500Canastas(List<Jugador> players){
        return players.stream().filter(jugador -> jugador.getCanastas()<=500 && jugador.getCanastas()>=200).map(Jugador::getNombre).collect(Collectors.toList());
    }
    //4
    public static List<Jugador> jugadoresOrderNacimiento(List<Jugador>players){
        return players.stream().sorted(Comparator.comparing(Jugador::getNacimiento)).collect(Collectors.toList());
    }
    //5
    public static List<Jugador> jugadoresOrderCanastas(List<Jugador>players){
        return players.stream().sorted(Comparator.comparing(Jugador::getCanastas)).collect(Collectors.toList());
    }
    //6
    public static List<Jugador> jugador5MasCanastas(List<Jugador>players){
        return players.stream().sorted(Comparator.comparing(Jugador::getCanastas).reversed()).limit(5).collect(Collectors.toList());
    }
    //7
    public static List<Jugador> entre200y500OrderNacimiento(List<Jugador> players){
        return players.stream().filter(jugador -> jugador.getCanastas()<=500 && jugador.getCanastas()>=200).sorted(Comparator.comparing(Jugador::getNacimiento).reversed()).collect(Collectors.toList());
    }
    //8
    public static Jugador jugadorMinCanastas(List<Jugador>players){
        return players.stream().min(Comparator.comparing(Jugador::getCanastas)).get();
    }
    //9
    public static Jugador jugadorMaxCanastas(List<Jugador>players){
        return players.stream().max(Comparator.comparing(Jugador::getCanastas)).get();
    }
    //10
    public static double avgCanastas(List<Jugador>players){
        return players.stream().mapToDouble(Jugador::getCanastas).average().getAsDouble();
    }
    //11
    public static List<Jugador> jugadoresEquipoInBCN(List<Jugador>players){
        return players.stream().filter(jugador -> jugador.getEquipo().getLocalidad().equalsIgnoreCase("Barcelona")).collect(Collectors.toList());
    }
    //12
    public static boolean jugadorMas4000Canastas(List<Jugador>players){
        return players.stream().anyMatch(jugador -> jugador.getCanastas()>4000);
    }
    //13
    public static boolean jugadoresMas50(List<Jugador>players){
        return players.stream().allMatch(jugador ->jugador.getCanastas()>50);
    }
    //14
    public static boolean jugadorMas50CanastasEquipo1(List<Jugador>players){
        return players.stream().filter(jugador -> jugador.getEquipo().getNombre().equalsIgnoreCase("Los Ángeles Mankers")).allMatch(jugador -> jugador.getCanastas()>50);
    }
    //15
    public static List<Jugador> jugadorEntre200y500CanastasOrderNacimiento(List<Jugador>players){
       return players.parallelStream()
               .filter(jugador -> jugador.getCanastas()<=500 && jugador.getCanastas()>=200)
               .sorted(Comparator.comparing(Jugador::getCanastas).thenComparing(Jugador::getNacimiento))
               .collect(Collectors.toList());         
    }
    //16
    public static Map<String,List<Equipo>> equiposGroupByLocalidad(List<Equipo>teams){
       return teams.stream().collect(groupingBy(Equipo::getLocalidad)); 
    }
    //17
    public static Map<Equipo,Integer> sumCanastasForEquipo(List<Jugador>players){
        return players.parallelStream().collect(Collectors.groupingBy(Jugador::getEquipo,Collectors.summingInt(Jugador::getCanastas)));
    }
    //18
    public static Integer sumCanastas(List<Jugador>players){
        return players.parallelStream().mapToInt(Jugador::getCanastas).reduce(0,(a,b)->a+b);
    }
       
}
