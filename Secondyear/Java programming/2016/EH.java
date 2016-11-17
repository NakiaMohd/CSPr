    //	 int DHKey=0;
    	  int DHKey = getHashKey(word);

    	 int MAX=127;

    	 int JumpSize= MAX-(DHKey%MAX);
    	 return JumpSize;
	//	return (JumpSize - (DHKey% JumpSize));

    //	 int maxJump=29;
    //	 return (maxJump- total%maxJump);
   //	return (int)word.charAt(word.length()-1);