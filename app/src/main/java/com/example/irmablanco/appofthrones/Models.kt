package com.example.irmablanco.appofthrones

import java.util.*

<<<<<<< HEAD

=======
>>>>>>> Add characters repo with singleton model
data  class Character(
        var id: String = UUID.randomUUID().toString(),
        var name: String,
        var born: String,
        var title: String,
        var actor: String,
        var quote: String,
        var father: String,
<<<<<<< HEAD
        var mother: String,
        var spouse: String,
        var house: House
)
=======
        var mother: String ,
        var spouse: String,
        var house: House)
>>>>>>> Add characters repo with singleton model

data class House(
        var name: String,
        var region: String,
<<<<<<< HEAD
        var words: String
)
=======
        var words: String)
>>>>>>> Add characters repo with singleton model
