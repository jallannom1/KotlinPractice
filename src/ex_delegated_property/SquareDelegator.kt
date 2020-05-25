package ex_delegated_property

<<<<<<< HEAD
=======
// 프로퍼티 선언문 뒤에 by 객체를 적으면 해당 객체가 프로퍼티의 Getter/Setter를 대리하게 된다.

>>>>>>> bdde933b8d071c4c426b70ac463ca58cfd73bfd4
import kotlin.reflect.KProperty

class OnlyPositive{
    private var realValue: Int = 0

<<<<<<< HEAD
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int{
        return realValue
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int){
        realValue = if (value > 0) value else 0
=======
    operator fun getValue(thisRef: Any?, perperty: KProperty<*>): Int{
        return realValue
    }

    operator fun setValue(thisRef: Any?, perperty: KProperty<*>, value: Int){
        realValue = if(value > 0) value else 0
>>>>>>> bdde933b8d071c4c426b70ac463ca58cfd73bfd4
    }
}