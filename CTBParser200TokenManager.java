/* Generated By:JavaCC: Do not edit this line. CTBParser200TokenManager.java */

public class CTBParser200TokenManager implements CTBParser200Constants
{
private final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3ffc0L) != 0L)
         {
            jjmatchedKind = 33;
            return 8;
         }
         if ((active0 & 0x40000000L) != 0L)
            return 8;
         return -1;
      case 1:
         if ((active0 & 0x3ffc0L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 1;
            return 8;
         }
         return -1;
      case 2:
         if ((active0 & 0x1ffc0L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 2;
            return 8;
         }
         return -1;
      case 3:
         if ((active0 & 0xffc0L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 3;
            return 8;
         }
         return -1;
      case 4:
         if ((active0 & 0xcd40L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 4;
            return 8;
         }
         return -1;
      case 5:
         if ((active0 & 0x8440L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 5;
            return 8;
         }
         return -1;
      case 6:
         if ((active0 & 0x40L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 6;
            return 8;
         }
         return -1;
      default :
         return -1;
   }
}
private final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
private final int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
private final int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
private final int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 47:
         return jjMoveStringLiteralDfa1_0(0x10000000L);
      case 60:
         return jjMoveStringLiteralDfa1_0(0xaff40000L);
      case 62:
         return jjStopAtPos(0, 19);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 69:
         return jjStartNfaWithStates_0(0, 30, 8);
      case 72:
         return jjMoveStringLiteralDfa1_0(0x8000L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x10400L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0x200L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x840L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x4000L);
      case 88:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 89:
         return jjMoveStringLiteralDfa1_0(0x2000L);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
private final int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 47:
         return jjMoveStringLiteralDfa2_0(active0, 0x25500000L);
      case 62:
         if ((active0 & 0x10000000L) != 0L)
            return jjStopAtPos(1, 28);
         break;
      case 65:
         return jjMoveStringLiteralDfa2_0(active0, 0x880L);
      case 67:
         return jjMoveStringLiteralDfa2_0(active0, 0x240000L);
      case 68:
         return jjMoveStringLiteralDfa2_0(active0, 0x2000000L);
      case 69:
         return jjMoveStringLiteralDfa2_0(active0, 0x808040L);
      case 73:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000L);
      case 76:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 77:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000000L);
      case 78:
         return jjMoveStringLiteralDfa2_0(active0, 0x20000L);
      case 80:
         return jjMoveStringLiteralDfa2_0(active0, 0x3400L);
      case 82:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000L);
      case 85:
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 89:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
private final int jjMoveStringLiteralDfa2_0(long old0, long active0)
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
      case 61:
         if ((active0 & 0x20000L) != 0L)
            return jjStopAtPos(2, 17);
         break;
      case 65:
         return jjMoveStringLiteralDfa3_0(active0, 0x100L);
      case 66:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000L);
      case 67:
         return jjMoveStringLiteralDfa3_0(active0, 0x500000L);
      case 68:
         return jjMoveStringLiteralDfa3_0(active0, 0x4204000L);
      case 69:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 73:
         return jjMoveStringLiteralDfa3_0(active0, 0x2008000L);
      case 76:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 77:
         return jjMoveStringLiteralDfa3_0(active0, 0x20000080L);
      case 79:
         return jjMoveStringLiteralDfa3_0(active0, 0x88003000L);
      case 80:
         return jjMoveStringLiteralDfa3_0(active0, 0x200L);
      case 82:
         return jjMoveStringLiteralDfa3_0(active0, 0x40L);
      case 84:
         return jjMoveStringLiteralDfa3_0(active0, 0x10400L);
      case 86:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
private final int jjMoveStringLiteralDfa3_0(long old0, long active0)
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
      case 61:
         if ((active0 & 0x10000L) != 0L)
            return jjStopAtPos(3, 16);
         break;
      case 65:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 66:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 68:
         return jjMoveStringLiteralDfa4_0(active0, 0x8400000L);
      case 69:
         return jjMoveStringLiteralDfa4_0(active0, 0x800280L);
      case 70:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(3, 18);
         else if ((active0 & 0x200000L) != 0L)
            return jjStopAtPos(3, 21);
         break;
      case 71:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 73:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000400L);
      case 79:
         return jjMoveStringLiteralDfa4_0(active0, 0x20000000L);
      case 83:
         return jjMoveStringLiteralDfa4_0(active0, 0x3140L);
      case 84:
         return jjMoveStringLiteralDfa4_0(active0, 0x4000L);
      case 85:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000800L);
      case 86:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
private final int jjMoveStringLiteralDfa4_0(long old0, long active0)
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
      case 61:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(4, 7);
         else if ((active0 & 0x200L) != 0L)
            return jjStopAtPos(4, 9);
         else if ((active0 & 0x1000L) != 0L)
            return jjStopAtPos(4, 12);
         else if ((active0 & 0x2000L) != 0L)
            return jjStopAtPos(4, 13);
         break;
      case 65:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000L);
      case 68:
         return jjMoveStringLiteralDfa5_0(active0, 0x20000000L);
      case 69:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000800L);
      case 70:
         return jjMoveStringLiteralDfa5_0(active0, 0x500000L);
      case 71:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000L);
      case 72:
         return jjMoveStringLiteralDfa5_0(active0, 0xc000L);
      case 73:
         return jjMoveStringLiteralDfa5_0(active0, 0x40L);
      case 78:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 79:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 83:
         return jjMoveStringLiteralDfa5_0(active0, 0x100L);
      case 84:
         return jjMoveStringLiteralDfa5_0(active0, 0x80000000L);
      case 85:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
private final int jjMoveStringLiteralDfa5_0(long old0, long active0)
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
      case 61:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(5, 8);
         else if ((active0 & 0x800L) != 0L)
            return jjStopAtPos(5, 11);
         else if ((active0 & 0x4000L) != 0L)
            return jjStopAtPos(5, 14);
         break;
      case 62:
         if ((active0 & 0x100000L) != 0L)
            return jjStopAtPos(5, 20);
         else if ((active0 & 0x400000L) != 0L)
            return jjStopAtPos(5, 22);
         break;
      case 69:
         if ((active0 & 0x80000000L) != 0L)
            return jjStopAtPos(5, 31);
         break;
      case 71:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000L);
      case 76:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 78:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000400L);
      case 79:
         return jjMoveStringLiteralDfa6_0(active0, 0x40L);
      case 82:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000L);
      case 84:
         if ((active0 & 0x800000L) != 0L)
            return jjStopAtPos(5, 23);
         return jjMoveStringLiteralDfa6_0(active0, 0x8000L);
      case 85:
         return jjMoveStringLiteralDfa6_0(active0, 0x20000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
private final int jjMoveStringLiteralDfa6_0(long old0, long active0)
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
      case 61:
         if ((active0 & 0x400L) != 0L)
            return jjStopAtPos(6, 10);
         else if ((active0 & 0x8000L) != 0L)
            return jjStopAtPos(6, 15);
         break;
      case 65:
         return jjMoveStringLiteralDfa7_0(active0, 0x2000000L);
      case 69:
         if ((active0 & 0x8000000L) != 0L)
            return jjStopAtPos(6, 27);
         break;
      case 76:
         return jjMoveStringLiteralDfa7_0(active0, 0x20000000L);
      case 78:
         return jjMoveStringLiteralDfa7_0(active0, 0x40L);
      case 82:
         return jjMoveStringLiteralDfa7_0(active0, 0x4000000L);
      case 84:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
private final int jjMoveStringLiteralDfa7_0(long old0, long active0)
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
      case 61:
         if ((active0 & 0x40L) != 0L)
            return jjStopAtPos(7, 6);
         break;
      case 62:
         if ((active0 & 0x1000000L) != 0L)
            return jjStopAtPos(7, 24);
         break;
      case 65:
         return jjMoveStringLiteralDfa8_0(active0, 0x4000000L);
      case 69:
         return jjMoveStringLiteralDfa8_0(active0, 0x20000000L);
      case 77:
         if ((active0 & 0x2000000L) != 0L)
            return jjStopAtPos(7, 25);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
private final int jjMoveStringLiteralDfa8_0(long old0, long active0)
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
      case 62:
         if ((active0 & 0x20000000L) != 0L)
            return jjStopAtPos(8, 29);
         break;
      case 77:
         return jjMoveStringLiteralDfa9_0(active0, 0x4000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
private final int jjMoveStringLiteralDfa9_0(long old0, long active0)
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
      case 62:
         if ((active0 & 0x4000000L) != 0L)
            return jjStopAtPos(9, 26);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0);
}
private final void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
private final void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
private final void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}
private final void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}
private final void jjCheckNAddStates(int start)
{
   jjCheckNAdd(jjnextStates[start]);
   jjCheckNAdd(jjnextStates[start + 1]);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
private final int jjMoveNfa_0(int startState, int curPos)
{
   int[] nextStates;
   int startsAt = 0;
   jjnewStateCnt = 18;
   int i = 1;
   jjstateSet[0] = startState;
   int j, kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(6);
                  }
                  else if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(6);
                  else if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  else if (curChar == 35)
                     jjCheckNAddStates(3, 5);
                  break;
               case 1:
                  if ((0xffffffffffffdbffL & l) != 0L)
                     jjCheckNAddStates(3, 5);
                  break;
               case 2:
               case 3:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 4:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 3;
                  break;
               case 5:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(6);
                  break;
               case 6:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(6);
                  break;
               case 8:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 9:
                  if (curChar == 34)
                     jjCheckNAddStates(0, 2);
                  break;
               case 10:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 12:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 13:
                  if (curChar == 34 && kind > 34)
                     kind = 34;
                  break;
               case 14:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(6, 9);
                  break;
               case 15:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 16:
                  if ((0xf000000000000L & l) != 0L)
                     jjstateSet[jjnewStateCnt++] = 17;
                  break;
               case 17:
                  if ((0xff000000000000L & l) != 0L)
                     jjCheckNAdd(15);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(8);
                  break;
               case 1:
                  jjAddStates(3, 5);
                  break;
               case 8:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(8);
                  break;
               case 10:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               case 11:
                  if (curChar == 92)
                     jjAddStates(10, 12);
                  break;
               case 12:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(0, 2);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         MatchLoop: do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(3, 5);
                  break;
               case 10:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 2);
                  break;
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
      if ((i = jjnewStateCnt) == (startsAt = 18 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   10, 11, 13, 1, 2, 4, 10, 11, 15, 13, 12, 14, 16, 
};
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\126\105\122\123\111\117\116\75", 
"\116\101\115\105\75", "\103\114\101\123\123\75", "\124\131\120\105\75", 
"\117\120\124\111\117\116\75", "\126\101\114\125\105\75", "\130\120\117\123\75", "\131\120\117\123\75", 
"\127\111\104\124\110\75", "\110\105\111\107\110\124\75", "\117\125\124\75", "\111\116\75", 
"\74\103\102\106", "\76", "\74\57\103\102\106\76", "\74\103\104\106", "\74\57\103\104\106\76", 
"\74\105\126\105\116\124", "\74\57\105\126\105\116\124\76", "\74\104\111\101\107\122\101\115", 
"\74\57\104\111\101\107\122\101\115\76", "\74\115\117\104\125\114\105", "\57\76", "\74\57\115\117\104\125\114\105\76", 
"\105", "\74\122\117\125\124\105", null, null, null, };
public static final String[] lexStateNames = {
   "DEFAULT", 
};
static final long[] jjtoToken = {
   0x7ffffffc1L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
private ASCII_CharStream input_stream;
private final int[] jjrounds = new int[18];
private final int[] jjstateSet = new int[36];
protected char curChar;
public CTBParser200TokenManager(ASCII_CharStream stream)
{
   if (ASCII_CharStream.staticFlag)
      throw new Error("ERROR: Cannot use a static CharStream class with a non-static lexical analyzer.");
   input_stream = stream;
}
public CTBParser200TokenManager(ASCII_CharStream stream, int lexState)
{
   this(stream);
   SwitchTo(lexState);
}
public void ReInit(ASCII_CharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
private final void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 18; i-- > 0;)
      jjrounds[i] = 0x80000000;
}
public void ReInit(ASCII_CharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}
public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

private final Token jjFillToken()
{
   Token t = Token.newToken(jjmatchedKind);
   t.kind = jjmatchedKind;
   String im = jjstrLiteralImages[jjmatchedKind];
   t.image = (im == null) ? input_stream.GetImage() : im;
   t.beginLine = input_stream.getBeginLine();
   t.beginColumn = input_stream.getBeginColumn();
   t.endLine = input_stream.getEndLine();
   t.endColumn = input_stream.getEndColumn();
   return t;
}

int curLexState = 0;
int defaultLexState = 0;
int jjnewStateCnt;
int jjround;
int jjmatchedPos;
int jjmatchedKind;

public final Token getNextToken() 
{
  int kind;
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
      return matchedToken;
   }

   try { 
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
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

}
