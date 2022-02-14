package com.github.yuanboliu.techmap.services

import com.intellij.openapi.project.Project
import com.github.yuanboliu.techmap.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
