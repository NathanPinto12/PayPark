package com.example.paypark.database

import com.example.paypark.model.Parking
import com.google.firebase.ktx.Firebase

class ParkingRepository {
    //collection name
    private val COLLECTION_NAME = "Parkings"

    //database instance
    private val db = Firebase.firestore

    //for logging
    private val TAG: String = this.toString()

    fun addParking(parking: Parking){
        db.collection(COLLECTION_NAME).document(parking.id.toString()).set(parking)



    }

    fun getAllParkings(){

    }

    fun updateParking(){

    }

    fun deleteParking(){

    }
}