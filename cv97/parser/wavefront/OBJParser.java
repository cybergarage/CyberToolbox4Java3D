/* Generated By:JavaCC: Do not edit this line. OBJParser.java */
package cv97.parser.wavefront;

import java.io.*;

import cv97.*;
import cv97.node.*;
import cv97.field.*;

public class OBJParser implements OBJParserConstants {

        private ShapeNode                               mShapeNode;
        private IndexedFaceSetNode mIdxFaceSetNode;

        public OBJParser () {
        }

        public void initialize() {
                mShapeNode = new ShapeNode();
                mIdxFaceSetNode = new IndexedFaceSetNode();
                mShapeNode.addChildNode(mIdxFaceSetNode);
                mIdxFaceSetNode.addChildNode(new CoordinateNode());
                mIdxFaceSetNode.addChildNode(new NormalNode());
                mIdxFaceSetNode.setNormalPerVertex(true);
        }

        public ShapeNode getShapeNode() {
                return mShapeNode;
        }

        private IndexedFaceSetNode getIndexedFaceSetNode() {
                return mIdxFaceSetNode;
        }

        private CoordinateNode getCoordinateNode() {
                return getIndexedFaceSetNode().getCoordinateNodes();
        }

        private NormalNode getNormalNode() {
                return getIndexedFaceSetNode().getNormalNodes();
        }

        private void addCoodinate(float x, float y, float z) {
                getCoordinateNode().addPoint(x, y, z);
        }

        private void addNormal(float x, float y, float z) {
                getNormalNode().addVector(x, y, z);
        }


        private void addCoordIndex(int index) {
                getIndexedFaceSetNode().addCoordIndex(index);
        }

        public int getNCoordIndices() {
                return getIndexedFaceSetNode().getNCoordIndices();
        }

        public int getCoordIndex(int n) {
                return getIndexedFaceSetNode().getCoordIndex(n);
        }


        private void addNormalIndex(int index) {
                getIndexedFaceSetNode().addNormalIndex(index);
        }
        public int getNNormalIndices() {
                return getIndexedFaceSetNode().getNNormalIndices();
        }

        public int getNormalIndex(int n) {
                return getIndexedFaceSetNode().getNormalIndex(n);
        }


        private void addTexCoordIndex(int index) {
                getIndexedFaceSetNode().addTexCoordIndex(index);
        }

        public int getNTexCoordIndices() {
                return getIndexedFaceSetNode().getNTexCoordIndices();
        }

        public int getTexCoordIndex(int n) {
                return getIndexedFaceSetNode().getTexCoordIndex(n);
        }

///////////////////////////////////////////////
//	IntegerToken / FloatToken / NameToken
///////////////////////////////////////////////
  final public int IDToken() throws ParseException {
        Token t;
    t = jj_consume_token(ID);
                        {if (true) return Integer.parseInt(t.image);}
    throw new Error("Missing return statement in function");
  }

  final public float FloatToken() throws ParseException {
        Token t;
        Float floatObj;
    t = jj_consume_token(FLOAT_NUMBER);
                        floatObj = new Float(t.image);
                        {if (true) return floatObj.floatValue();}
                        //return Float.parseFloat(t.image);

    throw new Error("Missing return statement in function");
  }

  final public String NameToken() throws ParseException {
        Token   t;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ID:
      t = jj_consume_token(ID);
                        {if (true) return t.image;}
      break;
    case NAME:
      t = jj_consume_token(NAME);
                        {if (true) return t.image;}
      break;
    default:
      jj_la1[0] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
    throw new Error("Missing return statement in function");
  }

///////////////////////////////////////////////
// OBJ
///////////////////////////////////////////////
  final public void OBJ() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_1;
      }
      OBJElement();
    }
  }

  final public void OBJElement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 6:
      Vertex();
      break;
    case 7:
      VertexNormal();
      break;
    case 8:
    case 9:
    case 10:
    case 11:
      Grouping();
      break;
    case 13:
      Face();
      break;
    case 16:
    case 17:
      Material();
      break;
    case 14:
    case 15:
      TexMap();
      break;
    default:
      jj_la1[2] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

///////////////////////////////////////////////
//	Vertex
///////////////////////////////////////////////
  final public void Vertex() throws ParseException {
        float x, y, z;
    jj_consume_token(6);
    x = FloatToken();
    y = FloatToken();
    z = FloatToken();
                        addCoodinate(x, y, z);
  }

///////////////////////////////////////////////
//	VertexNormal
///////////////////////////////////////////////
  final public void VertexNormal() throws ParseException {
        float x, y, z;
    jj_consume_token(7);
    x = FloatToken();
    y = FloatToken();
    z = FloatToken();
                        addNormal(x, y, z);
  }

///////////////////////////////////////////////
//	Grouping
///////////////////////////////////////////////
  final public void Grouping() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 8:
      Group();
      break;
    case 9:
      SmoothingGroup();
      break;
    case 10:
      MergingGroup();
      break;
    case 11:
      ObjectName();
      break;
    default:
      jj_la1[3] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Group() throws ParseException {
        String groupName;
    jj_consume_token(8);
    label_2:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
      case NAME:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_2;
      }
      groupName = NameToken();
    }

  }

  final public void SmoothingGroup() throws ParseException {
        String groupName;
    jj_consume_token(9);
    groupName = NameToken();

  }

  final public void MergingGroup() throws ParseException {
        String groupName;
    jj_consume_token(10);
    groupName = NameToken();

  }

  final public void ObjectName() throws ParseException {
        String objName;
    jj_consume_token(11);
    objName = NameToken();

  }

///////////////////////////////////////////////
//	Face
///////////////////////////////////////////////
  final public void VertexIndex() throws ParseException {
        int v = -1;
        int t = -1;
        int n = -1;
    v = IDToken();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 12:
        ;
        break;
      default:
        jj_la1[5] = jj_gen;
        break label_3;
      }
      jj_consume_token(12);
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ID:
          ;
          break;
        default:
          jj_la1[6] = jj_gen;
          break label_4;
        }
        t = IDToken();
      }
      jj_consume_token(12);
      n = IDToken();
    }
                        if (v != -1)
                                addCoordIndex(v-1);
                        if (t != -1)
                                addTexCoordIndex(t-1);
                        if (n != -1)
                                addNormalIndex(n-1);
  }

  final public void Face() throws ParseException {
        String groupName;
    jj_consume_token(13);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_5;
      }
      VertexIndex();
    }
                        int nCoordIndices = getNCoordIndices();
                        if (0 < nCoordIndices) {
                                int idx = getCoordIndex(nCoordIndices-1);
                                if (idx != -1)
                                        addCoordIndex(-1);
                        }

                        int nNormalIndices = getNNormalIndices();
                        if (0 < nNormalIndices) {
                                int idx = getNormalIndex(nNormalIndices-1);
                                if (idx != -1)
                                        addNormalIndex(-1);
                        }

                        int nTexCoordIndices = getNTexCoordIndices();
                        if (0 < nTexCoordIndices) {
                                int idx = getTexCoordIndex(nTexCoordIndices-1);
                                if (idx != -1)
                                        addTexCoordIndex(-1);
                        }
  }

///////////////////////////////////////////////
// TexMap
///////////////////////////////////////////////
  final public void TexMap() throws ParseException {
        String mapName;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 14:
      jj_consume_token(14);
      mapName = NameToken();

      break;
    case 15:
      jj_consume_token(15);
      label_6:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ID:
        case NAME:
          ;
          break;
        default:
          jj_la1[8] = jj_gen;
          break label_6;
        }
        mapName = NameToken();
      }

      break;
    default:
      jj_la1[9] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

///////////////////////////////////////////////
// Material
///////////////////////////////////////////////
  final public void Material() throws ParseException {
        String matName;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 16:
      jj_consume_token(16);
      matName = NameToken();

      break;
    case 17:
      jj_consume_token(17);
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ID:
        case NAME:
          ;
          break;
        default:
          jj_la1[10] = jj_gen;
          break label_7;
        }
        matName = NameToken();
      }

      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  final public void Input() throws ParseException {
    OBJ();
    jj_consume_token(0);
  }

  public OBJParserTokenManager token_source;
  ASCII_CharStream jj_input_stream;
  public Token token, jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[12];
  final private int[] jj_la1_0 = {0xc0000,0x3efc0,0x3efc0,0xf00,0xc0000,0x1000,0x40000,0x40000,0xc0000,0xc000,0xc0000,0x30000,};

  public OBJParser(java.io.InputStream stream) {
    jj_input_stream = new ASCII_CharStream(stream, 1, 1);
    token_source = new OBJParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.InputStream stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  public OBJParser(java.io.Reader stream) {
    jj_input_stream = new ASCII_CharStream(stream, 1, 1);
    token_source = new OBJParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  public OBJParser(OBJParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  public void ReInit(OBJParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 12; i++) jj_la1[i] = -1;
  }

  final private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  final private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.Vector jj_expentries = new java.util.Vector();
  private int[] jj_expentry;
  private int jj_kind = -1;

  final public ParseException generateParseException() {
    jj_expentries.removeAllElements();
    boolean[] la1tokens = new boolean[22];
    for (int i = 0; i < 22; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 12; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 22; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.addElement(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.elementAt(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  final public void enable_tracing() {
  }

  final public void disable_tracing() {
  }

}
