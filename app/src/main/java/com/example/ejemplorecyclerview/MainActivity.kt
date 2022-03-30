package com.example.ejemplorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    var persona = listOf<Persona>(
        Persona("Persona 1", "1111-1111","persona1@mail.com","https://i.pinimg.com/originals/81/14/65/81146560444029ae79e24ecd6fb3c271.jpg"),
        Persona("Persona 2", "2222-2222","persona2@mail.com","https://previews.123rf.com/images/jemastock/jemastock1706/jemastock170610326/80262824-mann-profil-cartoon-gesicht-person-charakter-vektor-illustration.jpg"),
        Persona("Persona 3", "3333-3333","persona3@mail.com","https://previews.123rf.com/images/jemastock/jemastock1706/jemastock170607211/80044804-persona-senza-volto-ritratto-giovane-icona-del-fumetto-illustrazione-vettoriale.jpg"),
        Persona("Persona 4", "5555-5555","persona4@mail.com","https://rebasando.com/images/diseno/disenografico/comoenvejecerpersona1.jpg"),
        Persona("Persona 5", "6666-6666","persona5@mail.com","https://img1.freepng.es/20190630/xjy/kisspng-emojipedia-computer-icons-zero-width-joiner-tuxedo-5d1907b4637271.8834648015619214604073.jpg"),
        Persona("Persona 6", "7777-7777","persona6@mail.com","https://cdn-0.emojis.wiki/emoji-pics/facebook/person-in-tuxedo-facebook.png"),
        Persona("Persona 7", "8888-8888","persona7@mail.com","https://cdn.pixabay.com/photo/2012/04/26/19/47/man-42934_1280.png"),
        Persona("Persona 5", "6666-6666","persona5@mail.com","https://img1.freepng.es/20190630/xjy/kisspng-emojipedia-computer-icons-zero-width-joiner-tuxedo-5d1907b4637271.8834648015619214604073.jpg"),
        Persona("Persona 6", "7777-7777","persona6@mail.com","https://cdn-0.emojis.wiki/emoji-pics/facebook/person-in-tuxedo-facebook.png"),
        Persona("Persona 7", "8888-8888","persona7@mail.com","https://cdn.pixabay.com/photo/2012/04/26/19/47/man-42934_1280.png")

    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //persona[0].imagen
        val recyclerPersona = findViewById<RecyclerView>(R.id.recyclerPersona)
        val adapter = AdaptadorPersona(persona)
        recyclerPersona.layoutManager = LinearLayoutManager(this)
        recyclerPersona.adapter = adapter
    }

}