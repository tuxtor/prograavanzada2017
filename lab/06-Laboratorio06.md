Laboratorio número 5
====================

Tema
----
Listas enlazadas posicionales

Objetivo
--------
El objetivo del presente laboratorio es adquirir y comprobar sus conocimientos en las siguientes areas:

1. Implementación de estructuras posicionales y listas enlazadas

Tareas solicitadas
------------------
De acuerdo a sus conocimientos adquiridos, escriba un programa que sea capaz de implementar la siguiente estructura con una estructura de datos dinamica:

![Diagrama](http://sydney.edu.au/engineering/it/courses/info1105/2017/media/linkedlist-q1-solution.jpg)

Para su implementación se sugiere el uso de [PositionalList](https://github.com/tuxtor/prograavanzada2017/blob/master/demoestructuras/src/main/java/gt/url/edu/demoestructuras/listas/PositionalList.java)

Tarea para casa
---------------

Basado en la interfaz vista en clase PositionalLinkedList, implemente una version EnhancedPositionalLinkedList que agregue los siguientes metodos:

```
Position<E> search(E value)
Position<E> addBefore(Position<E> p, PositionalList<E> sublist)
Position<E> addAfter(Position<E> p, PositionalList<E> sublist)
Position<E> addFirst(Position<E> p, PositionalList<E> sublist)
Position<E> addLast(Position<E> p, PositionalList<E> sublist)
int distance(Position<E> a, Position<E> b)
```

Entregables
-----------
URL repo solución en el portal
Documentacion en GitHub

Fecha límite
------------

Lab 11:00 am
Tarea Lunes 23:55
