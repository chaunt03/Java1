����   4 �
 # = >
  =	 " ? @	 A B
  C	 A D E
 F G H
  I
  J
  K
  L M N
 O P Q R
  S 7 T 7 U V W
  = X
  Y
  Z
  [
  \ ]
  ^ _ ` list Ljava/util/ArrayList; 	Signature )Ljava/util/ArrayList<Ljava/lang/Double;>; <init> ()V Code LineNumberTable LocalVariableTable this LLab5/MangSoThuc; nhap x Ljava/lang/Double; input Ljava/util/Scanner; StackMapTable hienThi item a tinhTong tong D 
SourceFile MangSoThuc.java ( ) java/util/ArrayList $ % java/util/Scanner b c d ( e f g Nhập danh sách số thực:  h i j Nhập số:  k l m n o p q r (Nhập tiếp dữ liệu không (Y/N):  N s t p *********************** Danh sách số thực:  u v w x y z java/lang/Double java/lang/StringBuilder      { | { } ~ r  l Tổng:  { � Lab5/MangSoThuc java/lang/Object java/util/Iterator java/lang/System in Ljava/io/InputStream; (Ljava/io/InputStream;)V out Ljava/io/PrintStream; java/io/PrintStream println (Ljava/lang/String;)V 
nextDouble ()D valueOf (D)Ljava/lang/Double; add (Ljava/lang/Object;)Z nextLine ()Ljava/lang/String; java/lang/String equals iterator ()Ljava/util/Iterator; hasNext ()Z next ()Ljava/lang/Object; append -(Ljava/lang/String;)Ljava/lang/StringBuilder; -(Ljava/lang/Object;)Ljava/lang/StringBuilder; toString doubleValue (D)Ljava/lang/StringBuilder; ! " #     $ %  &    '   ( )  *   >     *� *� Y� � �    +   
       ,        - .    / )  *   �     L� Y� � L� 	� 
� � 
+� � M*� ,� W+� W� � 
+� � � � ��˱    +   .    
       #  ,  1  9  E  H  K  ,      # % 0 1    L - .    A 2 3  4   
 �  4  5 )  *   �     H� � 
� � 
*� � L+�  � )+�  � M� � Y� � ,� � � 
��Ա    +            +  D  G  ,     +  6 1    H - .   4    �  7� .  8 )  *   �     CH*� � N-�  � -�  � :'� cH��� � Y�  � '� !� � 
�    +       #  $  % & & ) ' B ( ,        6 1    C - .    A 9 :  4    � 
 7�   ;    <