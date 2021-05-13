package com.github.soleo.gitlensintellijplugin.services

import com.github.soleo.gitlensintellijplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
