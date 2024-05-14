package com.example.mbti

open class Mbti(
    val ie: Char,
    val jp: Char,
    val tf: Char,
    val sn: Char
) {

}

class Analysts(mbti:Mbti) {
    init {
        println("분석가 : ${mbti.ie}${mbti.jp}${mbti.tf}${mbti.sn}")
    }
}

class Diplomats(mbti: Mbti) {
    init {
        println("외교관 : ${mbti.ie}${mbti.jp}${mbti.tf}${mbti.sn}")
    }
}

class Sentinels(mbti: Mbti) {
    init {
        println("파수꾼 : ${mbti.ie}${mbti.jp}${mbti.tf}${mbti.sn}")
    }
}

class Explorers(mbti: Mbti) {
    init {
        println("탐험가 : ${mbti.ie}${mbti.jp}${mbti.tf}${mbti.sn}")
    }
}

fun main() {
    val analystMbti = Mbti('I', 'N', 'T', 'J')
    Analysts(analystMbti)

    val diplomatMbti = Mbti('E', 'N', 'F', 'P')
    Diplomats(diplomatMbti)

    val sentinelMbti = Mbti('I', 'S', 'F', 'J')
    Sentinels(sentinelMbti)

    val explorerMbti = Mbti('E', 'S', 'T', 'P')
    Explorers(explorerMbti)
}
