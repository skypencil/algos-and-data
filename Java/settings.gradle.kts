rootProject.name = "Java"
include("src:main:five-sort")
findProject(":src:main:five-sort")?.name = "five-sort"
