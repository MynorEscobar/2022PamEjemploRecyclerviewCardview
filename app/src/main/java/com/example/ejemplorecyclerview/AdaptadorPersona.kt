package com.example.ejemplorecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplorecyclerview.AdaptadorPersona.PersonaHolder
import com.squareup.picasso.Picasso


class AdaptadorPersona (val persona:List<Persona>):RecyclerView.Adapter<PersonaHolder>(){

    class PersonaHolder(val view: View): RecyclerView.ViewHolder(view) {
        val tvNombre: TextView = view.findViewById(R.id.tvNombre)
        val tvTelefono:TextView = view.findViewById(R.id.tvTelefono)
        val tvCorreo:TextView = view.findViewById(R.id.tvEmail)
        val image: ImageView = view.findViewById(R.id.ivPersona)

        fun render(persona: Persona){
            tvNombre.text = persona.nombre
            tvTelefono.text = persona.telefono
            tvCorreo.text = persona.correo
            Picasso.get().load(persona.imagen).into(image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonaHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return PersonaHolder(layoutInflater.inflate(R.layout.item_persona, parent, false))
    }

    override fun onBindViewHolder(holder: PersonaHolder, position: Int) {
        holder.render(persona[position])
    }

    override fun getItemCount(): Int = persona.size

}