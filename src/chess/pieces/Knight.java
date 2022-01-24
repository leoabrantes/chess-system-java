package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Knight extends ChessPiece {

	public Knight(Board board, Color color) {
		super(board, color);

	}
	

	@Override
	public String toString() {
		return "N";
	}

	@Override
	public boolean[][] possibleMoves() {
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

		Position p = new Position(0, 0);

		// nwlong
		p.setValues(position.getRow() - 2, position.getColumn() - 1);
		if (getBoard().positionExists(p) && (!getBoard().thereIsAPiece(p)||isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}


		// nwshort
		p.setValues(position.getRow() - 1, position.getColumn() - 2);
		if (getBoard().positionExists(p) && (!getBoard().thereIsAPiece(p)||isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		
		
		
		
		// nelong
		p.setValues(position.getRow() - 2, position.getColumn() + 1);
		if (getBoard().positionExists(p) && (!getBoard().thereIsAPiece(p)||isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// neshort
		p.setValues(position.getRow() - 1, position.getColumn() + 2);
		if (getBoard().positionExists(p) && (!getBoard().thereIsAPiece(p)||isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		
		
		
		
		// selong
		p.setValues(position.getRow() + 2, position.getColumn() + 1);
		if (getBoard().positionExists(p) && (!getBoard().thereIsAPiece(p)||isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		// seshort
		p.setValues(position.getRow() + 1, position.getColumn() + 2);
		if (getBoard().positionExists(p) && (!getBoard().thereIsAPiece(p)||isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		
		
		
		// swlong
		p.setValues(position.getRow() + 2, position.getColumn() - 1);
		if (getBoard().positionExists(p) && (!getBoard().thereIsAPiece(p)||isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}
		
		
		// swshort
		p.setValues(position.getRow() + 1, position.getColumn() - 2);
		if (getBoard().positionExists(p) && (!getBoard().thereIsAPiece(p)||isThereOpponentPiece(p))) {
			mat[p.getRow()][p.getColumn()] = true;
		}

		
		
		

		return mat;
	}

}
