/* Generated By:JavaCC: Do not edit this line. DoggoTokenManager.java */

/** Token Manager. */
public class DoggoTokenManager implements DoggoConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x1000004000L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 0;
            return 7;
         }
         if ((active0 & 0x60001b9e80L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 0;
            return 31;
         }
         if ((active0 & 0x642100L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 0;
            return 21;
         }
         return -1;
      case 1:
         if ((active0 & 0x700076ff80L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 1;
            }
            return 31;
         }
         if ((active0 & 0x90000L) != 0L)
            return 31;
         return -1;
      case 2:
         if ((active0 & 0x42000L) != 0L)
            return 31;
         if ((active0 & 0x40007adf80L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 2;
            }
            return 31;
         }
         return -1;
      case 3:
         if ((active0 & 0x400000L) != 0L)
            return 31;
         if ((active0 & 0x3adf80L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 3;
            return 31;
         }
         return -1;
      case 4:
         if ((active0 & 0xd780L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 4;
            return 31;
         }
         if ((active0 & 0x2a0800L) != 0L)
            return 31;
         if ((active0 & 0x100000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 5:
         if ((active0 & 0x8780L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 5;
            return 31;
         }
         if ((active0 & 0x5000L) != 0L)
            return 31;
         if ((active0 & 0x100000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 6:
         if ((active0 & 0x8780L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 6;
            return 31;
         }
         if ((active0 & 0x100000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 7:
         if ((active0 & 0x680L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 7;
            return 31;
         }
         if ((active0 & 0x8100L) != 0L)
            return 31;
         if ((active0 & 0x100000L) != 0L)
         {
            if (jjmatchedPos < 3)
            {
               jjmatchedKind = 26;
               jjmatchedPos = 3;
            }
            return -1;
         }
         return -1;
      case 8:
         if ((active0 & 0x400L) != 0L)
         {
            jjmatchedKind = 26;
            jjmatchedPos = 8;
            return 31;
         }
         if ((active0 & 0x280L) != 0L)
            return 31;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 40:
         return jjStopAtPos(0, 32);
      case 41:
         return jjStopAtPos(0, 34);
      case 42:
         return jjStopAtPos(0, 47);
      case 43:
         {
         jjmatchedKind = 45;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 44:
         {
         jjmatchedKind = 33;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x4000000000000L);
      case 45:
         {
         jjmatchedKind = 46;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 47:
         return jjStopAtPos(0, 48);
      case 58:
         return jjMoveStringLiteralDfa1_0(0x8000000L);
      case 59:
         return jjStopAtPos(0, 35);
      case 60:
         {
         jjmatchedKind = 43;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x110000000000L);
      case 61:
         return jjStopAtPos(0, 39);
      case 62:
         {
         jjmatchedKind = 41;
         jjmatchedPos = 0;
         }
         return jjMoveStringLiteralDfa1_0(0x40000000000L);
      case 94:
         return jjStopAtPos(0, 49);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x28000L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x1000004000L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x642100L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x4000000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x2000000000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x680L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x90000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x100000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 32:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(1, 50);
         break;
      case 43:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(1, 23);
         break;
      case 45:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(1, 24);
         break;
      case 61:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(1, 27);
         else if ((active0 & 0x40000000000L) != 0L)
            return jjStopAtPos(1, 42);
         else if ((active0 & 0x100000000000L) != 0L)
            return jjStopAtPos(1, 44);
         break;
      case 62:
         if ((active0 & 0x10000000000L) != 0L)
            return jjStopAtPos(1, 40);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x700000L);
      case 99:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x1800L);
      case 102:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 105:
         if ((active0 & 0x10000L) != 0L)
         {
            jjmatchedKind = 16;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0xc2000L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000100L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x680L);
      case 116:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 26, 31);
         break;
      case 117:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(1, 26, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 98:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x600400L);
      case 110:
         if ((active0 & 0x2000L) != 0L)
         {
            jjmatchedKind = 13;
            jjmatchedPos = 2;
         }
         else if ((active0 & 0x4000000000L) != 0L)
            return jjStartNfaWithStates_0(2, 26, 31);
         return jjMoveStringLiteralDfa3_0(active0, 0x1c0100L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x20280L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 116:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x300L);
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x80L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0xc000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x400L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x81000L);
      case 114:
         return jjMoveStringLiteralDfa4_0(active0, 0x220000L);
      case 116:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(3, 22, 31);
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x800L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 32:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x8400L);
      case 101:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 31);
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 110:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(4, 19, 31);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x4080L);
      case 115:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(4, 17, 31);
         return jjMoveStringLiteralDfa5_0(active0, 0x40000L);
      case 116:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 31);
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x80L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x200L);
      case 101:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(5, 14, 31);
         break;
      case 104:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      case 105:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(5, 18);
         return jjMoveStringLiteralDfa6_0(active0, 0x500L);
      case 113:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 114:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(5, 12, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000L);
      case 109:
         return jjMoveStringLiteralDfa7_0(active0, 0x80L);
      case 111:
         return jjMoveStringLiteralDfa7_0(active0, 0x100L);
      case 112:
         return jjMoveStringLiteralDfa7_0(active0, 0x400L);
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x100200L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa8_0(active0, 0x400L);
      case 101:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(7, 20);
         break;
      case 109:
         return jjMoveStringLiteralDfa8_0(active0, 0x80L);
      case 110:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(7, 8, 31);
         break;
      case 114:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(7, 15, 31);
         return jjMoveStringLiteralDfa8_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(8, 7, 31);
         else if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(8, 9, 31);
         break;
      case 108:
         return jjMoveStringLiteralDfa9_0(active0, 0x400L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0); 
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0);
      return 9;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(9, 10, 31);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
static private int jjMoveNfa_0(int startState, int curPos)
{
   //int[] nextStates; // not used
   int startsAt = 0;
   jjnewStateCnt = 48;
   int i = 1;
   jjstateSet[0] = startState;
   //int j; // not used
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 28)
                        kind = 28;
                     jjCheckNAddStates(0, 2);
                  }
                  else if (curChar == 34)
                     jjCheckNAddTwoStates(35, 36);
                  else if (curChar == 46)
                  {
                     if (kind > 29)
                        kind = 29;
                     jjCheckNAdd(33);
                  }
                  else if (curChar == 36)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 7:
               case 31:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(31);
                  break;
               case 21:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(31);
                  break;
               case 1:
                  if ((0x3ff000100000000L & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if (curChar == 36 && kind > 6)
                     kind = 6;
                  break;
               case 32:
                  if (curChar != 46)
                     break;
                  kind = 29;
                  jjCheckNAdd(33);
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 29)
                     kind = 29;
                  jjCheckNAdd(33);
                  break;
               case 34:
                  if (curChar == 34)
                     jjCheckNAddTwoStates(35, 36);
                  break;
               case 35:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(35, 36);
                  break;
               case 36:
                  if (curChar == 34 && kind > 30)
                     kind = 30;
                  break;
               case 45:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAddStates(0, 2);
                  break;
               case 46:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 28)
                     kind = 28;
                  jjCheckNAdd(46);
                  break;
               case 47:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(47, 32);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                     jjCheckNAdd(31);
                  }
                  if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 43;
                  else if (curChar == 86)
                     jjstateSet[jjnewStateCnt++] = 39;
                  else if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 28;
                  else if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 21;
                  else if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 13;
                  else if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 7:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                     jjCheckNAdd(31);
                  }
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 21:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                  {
                     if (kind > 26)
                        kind = 26;
                     jjCheckNAdd(31);
                  }
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 1:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjAddStates(3, 4);
                  break;
               case 3:
                  if (curChar == 114 && kind > 25)
                     kind = 25;
                  break;
               case 4:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 5;
                  break;
               case 8:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 7;
                  break;
               case 9:
                  if (curChar == 101 && kind > 25)
                     kind = 25;
                  break;
               case 10:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 105)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 13:
                  if (curChar == 104)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 99)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 116 && kind > 25)
                     kind = 25;
                  break;
               case 16:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 19:
                  if (curChar == 116)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 22:
                  if (curChar == 102)
                     jjstateSet[jjnewStateCnt++] = 21;
                  break;
               case 23:
                  if (curChar == 110 && kind > 25)
                     kind = 25;
                  break;
               case 24:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 23;
                  break;
               case 25:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if (curChar == 108)
                     jjstateSet[jjnewStateCnt++] = 25;
                  break;
               case 27:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 28:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 27;
                  break;
               case 29:
                  if (curChar == 98)
                     jjstateSet[jjnewStateCnt++] = 28;
                  break;
               case 30:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(31);
                  break;
               case 31:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 26)
                     kind = 26;
                  jjCheckNAdd(31);
                  break;
               case 35:
                  if ((0x7fffffe07fffffeL & l) != 0L)
                     jjAddStates(5, 6);
                  break;
               case 37:
                  if (curChar == 105 && kind > 31)
                     kind = 31;
                  break;
               case 38:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 37;
                  break;
               case 39:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 38;
                  break;
               case 40:
                  if (curChar == 86)
                     jjstateSet[jjnewStateCnt++] = 39;
                  break;
               case 41:
                  if (curChar == 120 && kind > 31)
                     kind = 31;
                  break;
               case 42:
                  if (curChar == 117)
                     jjstateSet[jjnewStateCnt++] = 41;
                  break;
               case 43:
                  if (curChar == 97)
                     jjstateSet[jjnewStateCnt++] = 42;
                  break;
               case 44:
                  if (curChar == 70)
                     jjstateSet[jjnewStateCnt++] = 43;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int hiByte = (int)(curChar >> 8);
         int i1 = hiByte >> 6;
         long l1 = 1L << (hiByte & 077);
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 48 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   46, 47, 32, 1, 2, 35, 36, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, 
"\160\162\157\147\162\141\155\155\145", "\146\157\156\143\164\151\157\156", "\160\162\157\143\145\144\165\162\145", 
"\160\162\151\156\143\151\160\141\154\145", "\144\145\142\165\164", "\162\145\164\157\165\162", "\146\151\156", 
"\145\143\162\151\162\145", "\141\146\146\151\143\150\145\162", "\163\151", "\141\154\157\162\163", 
"\146\151\156\40\163\151", "\163\151\156\157\156", "\164\141\156\164\40\161\165\145", 
"\146\141\151\162\145", "\146\141\151\164", "\53\53", "\55\55", null, null, "\72\75", null, null, null, 
null, "\50", "\54", "\51", "\73", "\145\164", "\157\165", "\156\157\156", "\75", 
"\74\76", "\76", "\76\75", "\74", "\74\75", "\53", "\55", "\52", "\57", "\136", 
"\54\40", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x7ffffffffff81L, 
};
static final long[] jjtoSkip = {
   0x7eL, 
};
static final long[] jjtoSpecial = {
   0x40L, 
};
static protected JavaCharStream input_stream;
static private final int[] jjrounds = new int[48];
static private final int[] jjstateSet = new int[96];
static StringBuffer image;
static int jjimageLen;
static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public DoggoTokenManager(JavaCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public DoggoTokenManager(JavaCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(JavaCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 48; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(JavaCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String tokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   if (jjmatchedPos < 0)
   {
      if (image == null)
         tokenImage = "";
      else
         tokenImage = image.toString();
      beginLine = endLine = input_stream.getBeginLine();
      beginColumn = endColumn = input_stream.getBeginColumn();
   }
   else
   {
      String im = jjstrLiteralImages[jjmatchedKind];
      tokenImage = (im == null) ? input_stream.GetImage() : im;
      beginLine = input_stream.getBeginLine();
      beginColumn = input_stream.getBeginColumn();
      endLine = input_stream.getEndLine();
      endColumn = input_stream.getEndColumn();
   }
   t = Token.newToken(jjmatchedKind, tokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  //int kind;
  Token specialToken = null;
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {   
   try   
   {     
      curChar = input_stream.BeginToken();
   }     
   catch(java.io.IOException e)
   {        
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      matchedToken.specialToken = specialToken;
      return matchedToken;
   }
   image = null;
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 28;
   jjmatchedPos = -1;
   curPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         matchedToken.specialToken = specialToken;
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         if ((jjtoSpecial[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
         {
            matchedToken = jjFillToken();
            if (specialToken == null)
               specialToken = matchedToken;
            else
            {
               matchedToken.specialToken = specialToken;
               specialToken = (specialToken.next = matchedToken);
            }
         }
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static int[] jjemptyLineNo = new int[1];
static int[] jjemptyColNo = new int[1];
static boolean[] jjbeenHere = new boolean[1];
static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 0 :
         break;
      case 7 :
         break;
      case 8 :
         break;
      case 9 :
         break;
      case 10 :
         break;
      case 11 :
         break;
      case 12 :
         break;
      case 13 :
         break;
      case 14 :
         break;
      case 15 :
         break;
      case 16 :
         break;
      case 17 :
         break;
      case 18 :
         break;
      case 19 :
         break;
      case 20 :
         break;
      case 21 :
         break;
      case 22 :
         break;
      case 23 :
         break;
      case 24 :
         break;
      case 25 :
         break;
      case 26 :
         break;
      case 27 :
         break;
      case 28 :
         if (jjmatchedPos == -1)
         {
            if (jjbeenHere[0] &&
                jjemptyLineNo[0] == input_stream.getBeginLine() && 
                jjemptyColNo[0] == input_stream.getBeginColumn())
               throw new TokenMgrError(("Error: Bailing out of infinite loop caused by repeated empty string matches at line " + input_stream.getBeginLine() + ", column " + input_stream.getBeginColumn() + "."), TokenMgrError.LOOP_DETECTED);
            jjemptyLineNo[0] = input_stream.getBeginLine();
            jjemptyColNo[0] = input_stream.getBeginColumn();
            jjbeenHere[0] = true;
         }
         break;
      case 29 :
         break;
      case 30 :
         break;
      case 31 :
         break;
      case 32 :
         break;
      case 33 :
         break;
      case 34 :
         break;
      case 35 :
         break;
      case 36 :
         break;
      case 37 :
         break;
      case 38 :
         break;
      case 39 :
         break;
      case 40 :
         break;
      case 41 :
         break;
      case 42 :
         break;
      case 43 :
         break;
      case 44 :
         break;
      case 45 :
         break;
      case 46 :
         break;
      case 47 :
         break;
      case 48 :
         break;
      case 49 :
         break;
      case 50 :
         break;
      default : 
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}