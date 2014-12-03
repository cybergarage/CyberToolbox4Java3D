/* Generated By:JavaCC: Do not edit this line. NFFParser.java */
package cv97.parser.sense8;

import java.io.*;

import cv97.*;
import cv97.node.*;
import cv97.field.*;
import cv97.util.*;

public class NFFParser implements NFFParserConstants {

        private ShapeNode                               mShapeNode;
        private IndexedFaceSetNode mIdxFaceSetNode;

        public NFFParser () {
        }

        public void initialize() {
                mShapeNode = new ShapeNode();
                mIdxFaceSetNode = new IndexedFaceSetNode();
                mIdxFaceSetNode.setColorPerVertex(false);
                mIdxFaceSetNode.setNormalPerVertex(true);
                mShapeNode.addChildNode(mIdxFaceSetNode);
                mIdxFaceSetNode.addChildNode(new CoordinateNode());
                //mIdxFaceSetNode.addChildNode(new NormalNode());
                mIdxFaceSetNode.addChildNode(new ColorNode());
        }

        public ShapeNode getShapeNode() {
                return mShapeNode;
        }

        public IndexedFaceSetNode getIndexedFaceSetNode() {
                return mIdxFaceSetNode;
        }

        private CoordinateNode getCoordinateNode() {
                return getIndexedFaceSetNode().getCoordinateNodes();
        }

        private NormalNode getNormalNode() {
                return getIndexedFaceSetNode().getNormalNodes();
        }

        private ColorNode getColorNode() {
                return getIndexedFaceSetNode().getColorNodes();
        }

        private void addCoordinate(float x, float y, float z) {
                getCoordinateNode().addPoint(x, y, z);
        }

        private void addNormal(float x, float y, float z) {
                getNormalNode().addVector(x, y, z);
        }

        private void addColor(float color[]) {
                getColorNode().addColor(color);
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
  final public int IndexToken() throws ParseException {
        Token t;
    t = jj_consume_token(INDEX);
                        {if (true) return Integer.parseInt(t.image);}
    throw new Error("Missing return statement in function");
  }

  final public int NumberToken() throws ParseException {
        Token t;
    t = jj_consume_token(NUMBER);
                        {if (true) return Integer.parseInt(t.image);}
    throw new Error("Missing return statement in function");
  }

  final public float FloatToken() throws ParseException {
        Token t;
        Float floatObj;
    t = jj_consume_token(VALUE);
                        floatObj = new Float(t.image);
                        {if (true) return floatObj.floatValue();}
                        //return Float.parseFloat(t.image);

    throw new Error("Missing return statement in function");
  }

  final public float[] ColorToken() throws ParseException {
        String  colorString;
        int             colorValue;
        float           color[];
        Token           t;
    t = jj_consume_token(COLOR);
                        colorString = t.image.substring(2);
                        colorValue = Integer.parseInt(colorString, 16);
                        Debug.message("color = 0x" + Integer.toHexString(colorValue));
                        color = new float[3];
                        if (colorString.length() == 3) {
                                color[0] = (float)((colorValue & 0xF00) >> 8)/ 127.0f;
                                color[1] = (float)((colorValue & 0x0F0) >> 4)/ 127.0f;
                                color[2] = (float)((colorValue & 0x00F) >> 0)/ 127.0f;
                        }
                        else {
                                color[0] = (float)((colorValue & 0xFF0000) >> 16)/ 255.0f;
                                color[1] = (float)((colorValue & 0x00FF00) >> 8 )/ 255.0f;
                                color[2] = (float)((colorValue & 0x0000FF) >> 0 )/ 255.0f;
                        }
                        {if (true) return color;}
    throw new Error("Missing return statement in function");
  }

  final public String NameToken() throws ParseException {
        Token   t;
    t = jj_consume_token(NAME);
                        {if (true) return t.image;}
    throw new Error("Missing return statement in function");
  }

///////////////////////////////////////////////
// NFF
///////////////////////////////////////////////
  final public void NFF() throws ParseException {
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 5:
      case 6:
      case 7:
      case 8:
      case NAME:
      case EOL:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      NFFElement();
    }
  }

  final public void NFFElement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 5:
      Header();
      break;
    case 6:
      Version();
      break;
    case 7:
      Viewpos();
      break;
    case 8:
      Viewdir();
      break;
    case NAME:
      Object();
      break;
    case EOL:
      jj_consume_token(EOL);
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

///////////////////////////////////////////////
//	Header
///////////////////////////////////////////////
  final public void Header() throws ParseException {
    jj_consume_token(5);
    jj_consume_token(EOL);

  }

///////////////////////////////////////////////
//	Version
///////////////////////////////////////////////
  final public void Version() throws ParseException {
        float ver;
    jj_consume_token(6);
    ver = FloatToken();
    jj_consume_token(EOL);

  }

///////////////////////////////////////////////
//	Viewpos
///////////////////////////////////////////////
  final public void Viewpos() throws ParseException {
        float x, y, z;
    jj_consume_token(7);
    x = FloatToken();
    y = FloatToken();
    z = FloatToken();
    jj_consume_token(EOL);

  }

///////////////////////////////////////////////
//	Viewdir
///////////////////////////////////////////////
  final public void Viewdir() throws ParseException {
        float x, y, z;
    jj_consume_token(8);
    x = FloatToken();
    y = FloatToken();
    z = FloatToken();
    jj_consume_token(EOL);

  }

///////////////////////////////////////////////
//	Viewdir
///////////////////////////////////////////////
  final public void Object() throws ParseException {
    ObjectName();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case 9:
      MaterialName();
      break;
    default:
      jj_la1[2] = jj_gen;
      ;
    }
    DefVertex();
    DefPoly();

  }

///////////////////////////////////////////////
//	ObjectName
///////////////////////////////////////////////
  final public void ObjectName() throws ParseException {
        String objName;
    objName = NameToken();
    jj_consume_token(EOL);
                        getShapeNode().setName(objName);
                        Debug.message("NAME = " + objName);
  }

///////////////////////////////////////////////
//	MaterialTable
///////////////////////////////////////////////
  final public void MaterialName() throws ParseException {
        String matName;
    jj_consume_token(9);
    matName = NameToken();
    jj_consume_token(EOL);

  }

///////////////////////////////////////////////
//	DefVertex
///////////////////////////////////////////////
  final public void DefVertex() throws ParseException {
    NVertices();
    label_2:
    while (true) {
      Vertex();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VALUE:
        ;
        break;
      default:
        jj_la1[3] = jj_gen;
        break label_2;
      }
    }

  }

///////////////////////////////////////////////
//	Vertex
///////////////////////////////////////////////
  final public void NVertices() throws ParseException {
        int nVertices;
    nVertices = IndexToken();
    jj_consume_token(EOL);
                        Debug.message("number of vertices = " + nVertices);
  }

  final public void Vertex() throws ParseException {
    VertexPos();
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 10:
      case 11:
      case 12:
      case 13:
        ;
        break;
      default:
        jj_la1[4] = jj_gen;
        break label_3;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 11:
        VertexNormal();
        break;
      case 10:
        jj_consume_token(10);
        break;
      case 12:
        VertexColor();
        break;
      case 13:
        VertexTexCoord();
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(EOL);

  }

  final public void VertexPos() throws ParseException {
        float vx, vy, vz;
    vx = FloatToken();
    vy = FloatToken();
    vz = FloatToken();
                        addCoordinate(vx, vy, vz);
                        Debug.message(vx + ", " + vy + ", " + vz);
  }

  final public void VertexNormal() throws ParseException {
        float nx, ny, nz;
    jj_consume_token(11);
    nx = FloatToken();
    ny = FloatToken();
    nz = FloatToken();

  }

  final public void VertexColor() throws ParseException {
        float color[];
    jj_consume_token(12);
    color = ColorToken();

  }

  final public void VertexTexCoord() throws ParseException {
        float u, v;
    jj_consume_token(13);
    u = FloatToken();
    v = FloatToken();

  }

///////////////////////////////////////////////
//	DefPoly
///////////////////////////////////////////////
  final public void DefPoly() throws ParseException {
        int nPolys;
    NPolys();
    label_4:
    while (true) {
      Poly();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INDEX:
        ;
        break;
      default:
        jj_la1[6] = jj_gen;
        break label_4;
      }
    }

  }

///////////////////////////////////////////////
//	Poly
///////////////////////////////////////////////
  final public void NPolys() throws ParseException {
        int nPolys;
    nPolys = IndexToken();
    jj_consume_token(EOL);

  }

  final public void Poly() throws ParseException {
    Shape();
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
      case 15:
      case 16:
      case 17:
      case TEXTURE:
      case PORTAL:
      case POLYID:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_5;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case 14:
        jj_consume_token(14);
        break;
      case TEXTURE:
        jj_consume_token(TEXTURE);
        break;
      case 15:
        Rot();
        break;
      case 16:
        Scale();
        break;
      case 17:
        Trans();
        break;
      case POLYID:
        jj_consume_token(POLYID);
        break;
      case PORTAL:
        jj_consume_token(PORTAL);
        break;
      default:
        jj_la1[8] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
    jj_consume_token(EOL);

  }

  final public void Shape() throws ParseException {
        int     nIndices;
        float   color[];
    nIndices = IndexToken();
    label_6:
    while (true) {
      ShapeIndex();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INDEX:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_6;
      }
    }
    color = ColorToken();
                        addColor(color);
                        addCoordIndex(-1);
  }

  final public void ShapeIndex() throws ParseException {
        int     index;
    index = IndexToken();
                        addCoordIndex(index);
  }

  final public void Rot() throws ParseException {
        float angle;
    jj_consume_token(15);
    angle = NumberToken();

  }

  final public void Scale() throws ParseException {
        float factor;
    jj_consume_token(16);
    factor = NumberToken();

  }

  final public void Trans() throws ParseException {
        float x, y;
    jj_consume_token(17);
    x = NumberToken();
    y = NumberToken();

  }

  final public void Input() throws ParseException {
    NFF();
    jj_consume_token(0);
  }

  public NFFParserTokenManager token_source;
  ASCII_CharStream jj_input_stream;
  public Token token, jj_nt;
  private int jj_ntk;
  private int jj_gen;
  final private int[] jj_la1 = new int[10];
  final private int[] jj_la1_0 = {0x81001e0,0x81001e0,0x200,0x200000,0x3c00,0x3c00,0x40000,0x703c000,0x703c000,0x40000,};

  public NFFParser(java.io.InputStream stream) {
    jj_input_stream = new ASCII_CharStream(stream, 1, 1);
    token_source = new NFFParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.InputStream stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  public NFFParser(java.io.Reader stream) {
    jj_input_stream = new ASCII_CharStream(stream, 1, 1);
    token_source = new NFFParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  public NFFParser(NFFParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
  }

  public void ReInit(NFFParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 10; i++) jj_la1[i] = -1;
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
    boolean[] la1tokens = new boolean[28];
    for (int i = 0; i < 28; i++) {
      la1tokens[i] = false;
    }
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 10; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 28; i++) {
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
