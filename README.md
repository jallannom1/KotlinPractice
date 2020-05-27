Kotlin 문법 정리
==============


참조 : https://kotlinlang.org/docs/reference/
---

Index
-----

#### Link 없는 부분은 [google](https://google.com) 에 검색해서 습득하세요.

1. [Hello, Kotlin](https://github.com/jallannom1/KotlinPractice/blob/master/src/HelloKotlin.kt)
2. [표현식](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_Expression.kt)
3. [변수](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_Variable.kt)
4. [리터럴 타입](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_LiteralDataType.kt)
5. 산술
6. [증감](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_IncrementAndDecrementOperator.kt)
7. [비트](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_BitwiseOperator.kt)
8. 정수 타입과 실수 타입
9. 실수 타입의 함정
10. 문자 타입
11. 문자열
12. [문자열 안에 표현식의 값 넣기](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_ExpressionIntoString.kt)
13. Alias
14. 주석
15. 배정
16. 문장
17. 비교
18. 논리 연산
19. if
20. if-else
21. if-else 중첩
22. if-else 표현식
23. [when](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_When.kt)
24. [while](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_While.kt)
25. [do-while](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_While.kt)
27. [continue](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_While.kt)
28. [break](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_While.kt)
29. [label](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_Label.kt)
30. [함수](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_function.kt)
31. [매개변수 and 인수](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_ParameterAndArgument.kt)
32. [Unit](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_ParameterAndArgument.kt)
33. [Default](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_ParameterAndArgument.kt)
34. [vararg 인수](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_ParameterAndArgument.kt)
35. Overloding
36. [지역, 전역 변수](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_LocalAndGlobalVariable.kt)
37. [지역 변수와 전역변수 이름 중복](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_LocalAndGlobalVariable.kt)
38. [지역 변수와 다룬 함수의 지역 변수 중복](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_LocalDuplication.kt)
39. [지역 함수](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_LocalFunction.kt)
40. [Memory Stack](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_MemoryStack.kt)
41. [Source File 여러 개로 분리](https://github.com/jallannom1/KotlinPractice/blob/master/src/EX_SplitSourceFile.kt)
42. [Package](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_package)
43. 다른 패키지내 함수 호출
44. [Object](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_object) 
45. [Memory Heap](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_memory_heap)
46. [Class](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_class)
47. [Heap 존재 이유](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_role_of_heap)
48. 문자열간 + 연산 주의점
49. [Garbage Collection](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_garbage_collection)
50. [===, !==](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_triple_equals)
51. [멤버 함수](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_member_function)
52. [프로퍼티와 멤버 함수의 매개변수 이름 중복시](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_this_duplication)
53. [생성자와 초기화 블록](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_constructor)
54. [init블록 나눠쓰기](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_init_blocks)
55. [생성자와 프로퍼티 한번에 쓰기](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_property_in_constructor)
56. [보조 생성자](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_secondary_constructor)
57. [프로퍼티와 Getter/Setter](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_property_getter_setter)
58. [연산자 Overloading](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_operator_overloading)
59. [번호 붙은 접근 연산자](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_indexed_access_operator)
60. [호출 연산자](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_invoke_operator)
61. [in 연산자](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_in_operator)
62. [멤버 함수의 중위 표기법](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_infix_notation)
63. [상속](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_inheritance)
64. [Upcasting](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_upcasting)
65. [Overriding](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_overriding)
66. [프로퍼티를 오버라이딩](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_overriding_property)
67. [다형성](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_polymorphism)
68. [Class를 상속하는 Object](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_object_extends_class)
69. [Any Class](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_any_class)
70. [예외](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_exception)
71. [예외 처리](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_exception_handling)
72. [Throw exception](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_throw_exception)
73. [Nothing 타입](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_nothing_type)
74. [Nullable 타입](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_null)
75. [Safe 호출 연산자](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_safe_call_operator)
76. [Not-null 단정 연산자](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_notnull_assertion_operator)
77. [Elvis 연산자](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_elvis_operator)
78. [Smart Casting](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_smart_casts)
79. [is 연산자](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_is_operator)
80. [as 연산자와 Downcasting](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_downcasting)
81. [접근 지정자](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_access_modifier)
82. [Private](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_access_modifier_private)
83. [Protected](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_access_modifier_protected)
84. [접근 지정자 Overriding](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_access_modifier_overriding)
85. [확장 함수](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_extension_function)
86. [확장 프로퍼티](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_extension_property)
87. [객체 선언](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_object_declaration)
88. [동반자 객체](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_companion_object)
89. [inline 함수](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_inline_function)
90. [const](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_const)
91. [lateinit](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_lateinit)
92. [Nullable 리시버](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_nullable_receiver)
93. [동반자 객체의 확장 함수](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_extension_function_companion_object)
94. [확장 함수의 리시버 타입이 상속 관계에 있을 때](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_extension_function_inherit_relation)
95. 
96. [추상 클래스](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_abstract_class)
97. [인터페이스](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_interface)
98. [Diamond_Problem](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_the_diamond_problem)
99. [Nested 클래스](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_nested_class)
100. [Inner 클래스](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_inner_class)
101. [Data 클래스](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_data_class)
102. [객체 분해하기](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_destructuring_object)
103. 
104. 
105. [함수 리터럴과 람다식](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_lambda_expression)
106. [익명 함수](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_anonymous_function)
107. [it 식별자](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_it_identifier)
108. [함수 참조](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_function_reference)
109. [고차 함수](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_higher_order_function)
110. [클로저](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_closure)
111. [리시버 붙은 함수 리터럴](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_function_literal_with_receiver)
112. [제네릭](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_generic)
113. [여러 타입을 인수로 받기](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_generic_several_types)
114. [Reified 매개변수](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_reified_type_parameter)
115. [클래스와 인터페이스에서 제네릭 사용](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_generic_to_class_and_interface)
116. [제네릭이 적용된 클래스 / 인터페이스 상속,구현하기](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_inherit_from_generic)
117. [특정 타입을 상속,구현하는 타입만 인수로 받기](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_generic_specific_type)
118. [in/out](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_kotlin_in_out)
119. [.. 범위 표현식](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_range)
120. [Iterator](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_iterator)
121. [for](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_for)
122. [Array](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_array)
123. [Array 가변인수 활용](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_array_to_vararg)
124. [Enum 클래스](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_enum_class)
125. [Enum에 프로퍼티와 멤버 함수 선언](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_enum_class_members)
126. [Enum 활용](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_enum_class_practice)
127. [Sealed 클래스](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_sealed_class)
128. [위임된 프로퍼티](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_delegated_property)
129. [클래스 위임](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_class_delegation)
130. [Pair Class](https://github.com/jallannom1/KotlinPractice/tree/master/src/ex_pair)
