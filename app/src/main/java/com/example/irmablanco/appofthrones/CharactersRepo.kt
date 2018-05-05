package com.example.irmablanco.appofthrones

object CharactersRepo {
    var character: MutableList<Character> = mutableListOf()

    private  fun dummyCharacters(): MutableList<Character> {
        val dummies: MutableList<Character> = mutableListOf()

        for (index in 1..10) {
            val character : Character =  Character(
                    name = "Personaje ${index}",
                    title = "Título ${index}",
                    born = "Nació en ${index}",
                    actor = "Actor ${index}",
                    quote = "Frase ${index}",
                    father = "Padre ${index}",
                    mother = "Madre ${index}",
                    spouse = "Esposa ${index}",
                    house = House(
                            name = "Casa ${index}",
                            region = "Region ${index}",
                            words = "Lema ${index}"
                    )

            )

            dummies.add(character);
        }

        return  dummies
    }
}