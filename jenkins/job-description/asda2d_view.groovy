 
listView('asda2d Jobs') {
    description('asda2d Jobs')
    jobs {
        regex('asda2d_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
