package com.example.irmablanco.appofthrones

object CharactersRepo {
<<<<<<< HEAD
    val characters: MutableList<Character> = mutableListOf()
=======
    var characters: MutableList<Character> = mutableListOf()
>>>>>>> Add characters repo with singleton model

    get() {
        if (field.isEmpty())
            field.addAll(dummyCharacters())
<<<<<<< HEAD

        return  field
    }

    private  fun dummyCharacters(): MutableList<Character> {

        return (1..10).map {

            intToCharacter(it)

        }.toMutableList()

    }
    private  fun intToCharacter(int: Int): Character {
=======
        return field
    }

    private fun dummyCharacters(): MutableList<Character>{
       return (1..10).map {
                   intToCharacter(it)
       }.toMutableList()

    }
    //funcion que recibe un entero y devuelve un personaje

    private fun intToCharacter(int: Int): Character{
>>>>>>> Add characters repo with singleton model
        return Character(
                name = "Personaje ${int}",
                title = "Título ${int}",
                born = "Nació en ${int}",
                actor = "Actor ${int}",
                quote = "Frase ${int}",
<<<<<<< HEAD
                father = "Padre ${int}",
                mother = "Madre ${int}",
                spouse = "Esposa ${int}",
                house = House(
                        name = "Casa ${int}",
=======
                father = "Father ${int}",
                mother = "Mother ${int}",
                spouse = "Spouse ${int}",
                house = House(
                        name = "Case ${int}",
>>>>>>> Add characters repo with singleton model
                        region = "Region ${int}",
                        words = "Lema ${int}"
                )
        )
<<<<<<< HEAD

    }
}
=======
    }
}
>>>>>>> Add characters repo with singleton model
