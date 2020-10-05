package com.github.pinpan.zowedeal.services

import com.intellij.openapi.project.Project
import com.github.pinpan.zowedeal.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
