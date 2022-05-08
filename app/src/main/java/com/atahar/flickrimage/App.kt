package com.atahar.flickrimage

import android.app.Application
import com.atahar.data.repositories.PhotosRepoImpl
import com.atahar.domain.usecases.GetPhotosUseCase
import com.atahar.flickrimage.di.ServiceLocator

class App : Application() {

    private val photosRepo: PhotosRepoImpl
        get() = ServiceLocator.providePhotosRepo(this)

    val getPhotosUseCase: GetPhotosUseCase
        get() = GetPhotosUseCase(photosRepo)

}