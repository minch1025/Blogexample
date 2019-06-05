package biz.km2y.blogexamples.model

import javax.persistence.*

@Entity
@Table(name="/users")
data class User(@Id @GeneratedValue var id:Int? = 0,
                @Column(nullable=false) var name:String = "",
                @Column var age:Int? =0,
                @Column(nullable=false) var sex:Int =0){

}

